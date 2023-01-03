package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.ReservationStatusDTO;
import com.edu.ozyegin.cs393.project.model.ReservationStatus;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-02T15:08:58+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class ReservationStatusMapperImpl implements ReservationStatusMapper {

    @Override
    public ReservationStatusDTO entityToDTO(ReservationStatus car) {
        if ( car == null ) {
            return null;
        }

        ReservationStatusDTO reservationStatusDTO = new ReservationStatusDTO();

        reservationStatusDTO.setId( car.getId() );
        reservationStatusDTO.setName( car.getName() );

        return reservationStatusDTO;
    }

    @Override
    public ReservationStatus DTOToEntity(ReservationStatusDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        ReservationStatus reservationStatus = new ReservationStatus();

        reservationStatus.setId( carDTO.getId() );
        reservationStatus.setName( carDTO.getName() );

        return reservationStatus;
    }
}
