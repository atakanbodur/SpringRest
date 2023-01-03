package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.edu.ozyegin.cs393.project.model.Car;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-02T19:37:52+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDTO entityToDTO(Car car) {
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

    @Override
    public Car DTOToEntity(CarDTO carDTO) {
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

    @Override
    public List<CarDTO> entityListToDtoList(List<Car> carList) {
        if ( carList == null ) {
            return null;
        }

        List<CarDTO> list = new ArrayList<CarDTO>( carList.size() );
        for ( Car car : carList ) {
            list.add( entityToDTO( car ) );
        }

        return list;
    }
}
