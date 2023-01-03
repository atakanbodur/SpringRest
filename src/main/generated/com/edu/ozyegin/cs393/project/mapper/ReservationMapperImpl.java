package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.edu.ozyegin.cs393.project.dto.LocationDTO;
import com.edu.ozyegin.cs393.project.dto.ReservationDTO;
import com.edu.ozyegin.cs393.project.model.Car;
import com.edu.ozyegin.cs393.project.model.Location;
import com.edu.ozyegin.cs393.project.model.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-02T19:26:00+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public ReservationDTO entityToDTO(Reservation car) {
        if ( car == null ) {
            return null;
        }

        ReservationDTO reservationDTO = new ReservationDTO();

        reservationDTO.setId( car.getId() );
        reservationDTO.setReservationNumber( car.getReservationNumber() );
        reservationDTO.setCar( carToCarDTO( car.getCar() ) );
        reservationDTO.setCreationDate( car.getCreationDate() );
        reservationDTO.setPickupDate( car.getPickupDate() );
        reservationDTO.setDropOffDate( car.getDropOffDate() );
        reservationDTO.setPickUpLocation( locationToLocationDTO( car.getPickUpLocation() ) );
        reservationDTO.setDropOffLocation( locationToLocationDTO( car.getDropOffLocation() ) );
        reservationDTO.setReturnDate( car.getReturnDate() );

        return reservationDTO;
    }

    @Override
    public Reservation DTOToEntity(ReservationDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setId( carDTO.getId() );
        reservation.setReservationNumber( carDTO.getReservationNumber() );
        reservation.setCar( carDTOToCar( carDTO.getCar() ) );
        reservation.setCreationDate( carDTO.getCreationDate() );
        reservation.setPickupDate( carDTO.getPickupDate() );
        reservation.setDropOffDate( carDTO.getDropOffDate() );
        reservation.setPickUpLocation( locationDTOToLocation( carDTO.getPickUpLocation() ) );
        reservation.setDropOffLocation( locationDTOToLocation( carDTO.getDropOffLocation() ) );
        reservation.setReturnDate( carDTO.getReturnDate() );

        return reservation;
    }

    @Override
    public List<ReservationDTO> entityListToDtoList(List<Reservation> reservations) {
        if ( reservations == null ) {
            return null;
        }

        List<ReservationDTO> list = new ArrayList<ReservationDTO>( reservations.size() );
        for ( Reservation reservation : reservations ) {
            list.add( entityToDTO( reservation ) );
        }

        return list;
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
}
