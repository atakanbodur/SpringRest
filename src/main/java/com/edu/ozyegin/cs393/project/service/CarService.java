package com.edu.ozyegin.cs393.project.service;

import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.edu.ozyegin.cs393.project.mapper.CarMapper;
import com.edu.ozyegin.cs393.project.model.Car;
import com.edu.ozyegin.cs393.project.model.Reservation;
import com.edu.ozyegin.cs393.project.repository.CarRepository;
import com.edu.ozyegin.cs393.project.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class CarService {
    @Autowired
    CarRepository carRepository;
    @Autowired
    ReservationRepository reservationRepository;


    public List<CarDTO> findAll() {
        List<Car> cars = carRepository.findAll();
        List<CarDTO> dtos = CarMapper.INSTANCE.entityListToDtoList(cars);
        return dtos;
    }

    public CarDTO findById(int id) {
        Optional<Car> l = carRepository.findById(id);
        if (l.isPresent()) {
            Car car = l.get();
            return CarMapper.INSTANCE.entityToDTO(car);
        } else return null;
    }

    public CarDTO save(CarDTO carDTO) {
        Car a = carRepository.save(CarMapper.INSTANCE.DTOToEntity(carDTO));
        return CarMapper.INSTANCE.entityToDTO(a);
    }

    public List<CarDTO> searchAvailableCars(String carType,String transmissionType){
        List<Car> result = carRepository.findAllByCarStatus_nameAndCarType_nameAndTransmissionType("AVAILABLE", carType, transmissionType);
        List<CarDTO> carDTOS = CarMapper.INSTANCE.entityListToDtoList(result);
        return carDTOS;
    }

    public String deleteCar(String barcodeNumber) {
        Optional<Car> car = carRepository.findAllByBarcode(barcodeNumber);
        if (!car.isPresent()) return "404";
        Optional<Reservation> reservation = reservationRepository.findByCar_Barcode(barcodeNumber);
        if (reservation.isPresent()) return "406";
        carRepository.deleteById(car.get().getId());
        Optional<Car> car2 = carRepository.findAllByBarcode(barcodeNumber);
        if (!car2.isPresent()) return "200";
        else return "500";
    }


}
