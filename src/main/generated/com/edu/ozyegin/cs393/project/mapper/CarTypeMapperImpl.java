package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.CarTypeDTO;
import com.edu.ozyegin.cs393.project.model.CarType;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-02T15:08:58+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class CarTypeMapperImpl implements CarTypeMapper {

    @Override
    public CarTypeDTO entityToDTO(CarType car) {
        if ( car == null ) {
            return null;
        }

        CarTypeDTO carTypeDTO = new CarTypeDTO();

        carTypeDTO.setId( car.getId() );
        carTypeDTO.setName( car.getName() );

        return carTypeDTO;
    }

    @Override
    public CarType DTOToEntity(CarTypeDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        CarType carType = new CarType();

        carType.setId( carDTO.getId() );
        carType.setName( carDTO.getName() );

        return carType;
    }
}
