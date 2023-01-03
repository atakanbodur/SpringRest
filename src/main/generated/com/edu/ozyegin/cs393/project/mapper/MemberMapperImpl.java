package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.edu.ozyegin.cs393.project.dto.LocationDTO;
import com.edu.ozyegin.cs393.project.dto.MemberDTO;
import com.edu.ozyegin.cs393.project.dto.ReservationDTO;
import com.edu.ozyegin.cs393.project.model.Car;
import com.edu.ozyegin.cs393.project.model.Location;
import com.edu.ozyegin.cs393.project.model.Member;
import com.edu.ozyegin.cs393.project.model.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-02T15:08:59+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public MemberDTO entityToDTO(Member car) {
        if ( car == null ) {
            return null;
        }

        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setId( car.getId() );
        memberDTO.setName( car.getName() );
        memberDTO.setAddress( car.getAddress() );
        memberDTO.setEmail( car.getEmail() );
        memberDTO.setPhone( car.getPhone() );
        memberDTO.setDrivingLicenseNum( car.getDrivingLicenseNum() );
        memberDTO.setReservations( reservationListToReservationDTOList( car.getReservations() ) );

        return memberDTO;
    }

    @Override
    public Member DTOToEntity(MemberDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Member member = new Member();

        member.setId( carDTO.getId() );
        member.setName( carDTO.getName() );
        member.setAddress( carDTO.getAddress() );
        member.setEmail( carDTO.getEmail() );
        member.setPhone( carDTO.getPhone() );
        member.setDrivingLicenseNum( carDTO.getDrivingLicenseNum() );
        member.setReservations( reservationDTOListToReservationList( carDTO.getReservations() ) );

        return member;
    }

    protected CarDTO carToCarDTO(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setCarType( car.getCarType() );
        carDTO.setCarStatus( car.getCarStatus() );
        carDTO.setId( car.getId() );
        carDTO.setBarcode( car.getBarcode() );
        carDTO.setLicenseNum( car.getLicenseNum() );
        carDTO.setPassengerCapacity( car.getPassengerCapacity() );
        carDTO.setBrand( car.getBrand() );
        carDTO.setModel( car.getModel() );
        carDTO.setMileage( car.getMileage() );
        carDTO.setTransmissionType( car.getTransmissionType() );
        carDTO.setPrice( car.getPrice() );

        return carDTO;
    }

    protected LocationDTO locationToLocationDTO(Location location) {
        if ( location == null ) {
            return null;
        }

        LocationDTO locationDTO = new LocationDTO();

        locationDTO.setCode( location.getCode() );
        locationDTO.setName( location.getName() );
        locationDTO.setAddress( location.getAddress() );

        return locationDTO;
    }

    protected ReservationDTO reservationToReservationDTO(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationDTO reservationDTO = new ReservationDTO();

        reservationDTO.setId( reservation.getId() );
        reservationDTO.setReservationNumber( reservation.getReservationNumber() );
        reservationDTO.setCar( carToCarDTO( reservation.getCar() ) );
        reservationDTO.setCreationDate( reservation.getCreationDate() );
        reservationDTO.setPickupDate( reservation.getPickupDate() );
        reservationDTO.setDropOffDate( reservation.getDropOffDate() );
        reservationDTO.setPickUpLocation( locationToLocationDTO( reservation.getPickUpLocation() ) );
        reservationDTO.setDropOffLocation( locationToLocationDTO( reservation.getDropOffLocation() ) );
        reservationDTO.setReturnDate( reservation.getReturnDate() );

        return reservationDTO;
    }

    protected List<ReservationDTO> reservationListToReservationDTOList(List<Reservation> list) {
        if ( list == null ) {
            return null;
        }

        List<ReservationDTO> list1 = new ArrayList<ReservationDTO>( list.size() );
        for ( Reservation reservation : list ) {
            list1.add( reservationToReservationDTO( reservation ) );
        }

        return list1;
    }

    protected Car carDTOToCar(CarDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Car car = new Car();

        car.setId( carDTO.getId() );
        car.setBarcode( carDTO.getBarcode() );
        car.setLicenseNum( carDTO.getLicenseNum() );
        car.setPassengerCapacity( carDTO.getPassengerCapacity() );
        car.setBrand( carDTO.getBrand() );
        car.setModel( carDTO.getModel() );
        car.setMileage( carDTO.getMileage() );
        car.setTransmissionType( carDTO.getTransmissionType() );
        car.setPrice( carDTO.getPrice() );
        car.setCarType( carDTO.getCarType() );
        car.setCarStatus( carDTO.getCarStatus() );

        return car;
    }

    protected Location locationDTOToLocation(LocationDTO locationDTO) {
        if ( locationDTO == null ) {
            return null;
        }

        Location location = new Location();

        location.setCode( locationDTO.getCode() );
        location.setName( locationDTO.getName() );
        location.setAddress( locationDTO.getAddress() );

        return location;
    }

    protected Reservation reservationDTOToReservation(ReservationDTO reservationDTO) {
        if ( reservationDTO == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setId( reservationDTO.getId() );
        reservation.setReservationNumber( reservationDTO.getReservationNumber() );
        reservation.setCar( carDTOToCar( reservationDTO.getCar() ) );
        reservation.setCreationDate( reservationDTO.getCreationDate() );
        reservation.setPickupDate( reservationDTO.getPickupDate() );
        reservation.setDropOffDate( reservationDTO.getDropOffDate() );
        reservation.setPickUpLocation( locationDTOToLocation( reservationDTO.getPickUpLocation() ) );
        reservation.setDropOffLocation( locationDTOToLocation( reservationDTO.getDropOffLocation() ) );
        reservation.setReturnDate( reservationDTO.getReturnDate() );

        return reservation;
    }

    protected List<Reservation> reservationDTOListToReservationList(List<ReservationDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Reservation> list1 = new ArrayList<Reservation>( list.size() );
        for ( ReservationDTO reservationDTO : list ) {
            list1.add( reservationDTOToReservation( reservationDTO ) );
        }

        return list1;
    }
}
