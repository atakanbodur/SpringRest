package com.edu.ozyegin.cs393.project.service;

import com.edu.ozyegin.cs393.project.dto.GetAllRentedCarsResponseDTO;
import com.edu.ozyegin.cs393.project.dto.ReservationDTO;
import com.edu.ozyegin.cs393.project.mapper.ReservationMapper;
import com.edu.ozyegin.cs393.project.model.*;
import com.edu.ozyegin.cs393.project.repository.*;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.concurrent.TimeUnit;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    CarRepository carRepository;
    @Autowired
    LocationRepository locationRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    CarStatusRepository carStatusRepository;
    @Autowired
    CarService carService;
    @Autowired
    ServiceRepository serviceRepository;
    @Autowired
    private EquipmentRepository equipmentRepository;


    public String generateReservationNumber() {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder((100000 + rnd.nextInt(900000)) + "-");
        for (int i = 0; i < 5; i++)
            sb.append(chars[rnd.nextInt(chars.length)]);

        return sb.toString();
    }


    public List<ReservationDTO> findAll() {
        List<Reservation> all = reservationRepository.findAll();
        List<ReservationDTO> dtos = new ArrayList<>();
        dtos = ReservationMapper.INSTANCE.entityListToDtoList(all);
        return dtos;
    }

    public ReservationDTO findById(int id) {
        Optional<Reservation> l = reservationRepository.findById(id);
        if (l.isPresent()) {
            Reservation reservation = l.get();
            Car c = carRepository.findById(reservation.getCar().getId()).get();
            reservation.setCar(c);
            return ReservationMapper.INSTANCE.entityToDTO(reservation);
        } else return null;
    }

    public ReservationDTO save(ReservationDTO reservationDTO) {
        Reservation a = reservationRepository.save(ReservationMapper.INSTANCE.DTOToEntity(reservationDTO));
        return ReservationMapper.INSTANCE.entityToDTO(a);
    }

    @Transactional
    public ReservationDTO makeReservation(String carBarcodeNumber, int dayCount, int memberID, int pickUpLocationCode, int dropOffLocationCode, List<Integer> equipmentLists, List<Integer> serviceList) throws Exception {
        Optional<Car> car = carRepository.findAllBybarcodeAndCarStatus_name(carBarcodeNumber, "AVAILABLE");
        if (!car.isPresent()) throw new RuntimeException("Car not found");
        Optional<Location> pickUpLocation = locationRepository.findById(pickUpLocationCode);
        Optional<Location> dropOffLocation = locationRepository.findById(dropOffLocationCode);
        Optional<Member> member = memberRepository.findById(memberID);
        Reservation reservation = new Reservation();
        reservation.setReservationNumber(generateReservationNumber());
        reservation.setCar(car.get());
        reservation.setCreationDate(new Date());
        reservation.setPickupDate(DateUtils.addDays(new Date(), 1));//+1
        reservation.setDropOffDate(DateUtils.addDays(new Date(), 1 + dayCount));

        reservation.setPickUpLocation(pickUpLocation.get());
        reservation.setDropOffLocation(dropOffLocation.get());
        reservation.setMember(member.get());
        reservationRepository.save(reservation);
        Optional<CarStatus> cs = carStatusRepository.findByName("LOANED");
        car.get().setCarStatus(cs.get());
        carRepository.save(car.get());

        ReservationDTO reservationDTO = ReservationMapper.INSTANCE.entityToDTO(reservation);
        return reservationDTO;
    }

    public List<GetAllRentedCarsResponseDTO> getAllRentedCars() {
        List<GetAllRentedCarsResponseDTO> result = new ArrayList<>();

        List<Car> loaned = carRepository.findAllByCarStatus_name("LOANED");
        List<Car> reserved = carRepository.findAllByCarStatus_name("RESERVED");
        loaned.addAll(reserved);
        for (Car c : loaned) {
            GetAllRentedCarsResponseDTO d = new GetAllRentedCarsResponseDTO();
            Optional<Reservation> res = reservationRepository.findByCar_id(c.getId());
            d.brand = c.getBrand();
            d.model = c.getModel();
            d.transmissionType = c.getTransmissionType();
            d.barcode = c.getBarcode();
            d.carType = c.getCarType().getName();
            if (res.isPresent()) {
                d.reservationNumber = res.get().getReservationNumber();
                d.memberName = res.get().getMember().getName();
                d.dropOffDate = res.get().getDropOffDate();
                d.dropOffLocation = res.get().getDropOffLocation().getName();
                d.reservationDayCount = Math.toIntExact(TimeUnit.DAYS.convert((res.get().getDropOffDate().getTime() - res.get().getPickupDate().getTime()), TimeUnit.MILLISECONDS));
            }
            result.add(d);
        }
        return result;
    }

    @Transactional
    public String addServiceToReservation(String reservationNumber, Integer serciveCode) {
        Optional<Reservation> res = reservationRepository.findByReservationNumber(reservationNumber);
        if (res.isPresent()) {
            long cnt = res.get().getServiceList().stream().filter(l -> l.getId() == serciveCode).count();
            if (cnt > 0) {
                return "SERVICE_EXISTS";
            } else {
                Optional<com.edu.ozyegin.cs393.project.model.Service> theService = serviceRepository.findById(serciveCode);
                if (theService.isPresent()) {
                    res.get().getServiceList().add(theService.get());
                    reservationRepository.save(res.get());
                } else return "SERVICE_NOT_FOUND";
            }

        } else return "RESERVATION_NOT_FOUND";
        return "OK";
    }

    @Transactional
    public String addEquipmentToReservation(String reservationNumber, Integer equipmentCode) {
        Optional<Reservation> res = reservationRepository.findByReservationNumber(reservationNumber);
        if (res.isPresent()) {
            long cnt = res.get().getEquipmentList().stream().filter(l -> l.getId() == equipmentCode).count();
            if (cnt > 0) {
                return "EQUIPMENT_EXISTS";
            } else {
                Optional<Equipment> theEquipment = equipmentRepository.findById(equipmentCode);
                if (theEquipment.isPresent()) {
                    res.get().getEquipmentList().add(theEquipment.get());
                    reservationRepository.save(res.get());
                } else return "EQUIPMENT_NOT_FOUND";
            }

        } else return "RESERVATION_NOT_FOUND";
        return "OK";
    }

    @Transactional
    public String cancelReservation(String resNum) {
        Optional<Reservation> reservation = reservationRepository.findByReservationNumber(resNum);
        if (!reservation.isPresent()) return "404";
        Optional<Car> c = carRepository.findById(reservation.get().getCar().getId());
        reservationRepository.deleteById(reservation.get().getId());
        if (!reservationRepository.findById(reservation.get().getId()).isPresent() && c.isPresent()) {
            c.get().setCarStatus(carStatusRepository.findByName("AVAILABLE").get());
            carRepository.save(c.get());
            return "200";
        }
        else return "500";
    }
}
