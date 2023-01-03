package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.CarStatusDTO;
import com.edu.ozyegin.cs393.project.model.CarStatus;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-02T15:08:59+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class CarStatusMapperImpl implements CarStatusMapper {

    @Override
    public CarStatusDTO entityToDTO(CarStatus car) {
        if ( car == null ) {
            return null;
        }

        CarStatusDTO carStatusDTO = new CarStatusDTO();

        carStatusDTO.setId( car.getId() );
        carStatusDTO.setName( car.getName() );

        return carStatusDTO;
    }

    @Override
    public CarStatus DTOToEntity(CarStatusDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        CarStatus carStatus = new CarStatus();

        carStatus.setId( carDTO.getId() );
        carStatus.setName( carDTO.getName() );

        return carStatus;
    }
}
