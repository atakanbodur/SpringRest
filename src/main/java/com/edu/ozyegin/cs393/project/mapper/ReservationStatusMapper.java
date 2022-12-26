package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.ReservationDTO;
import com.edu.ozyegin.cs393.project.dto.ReservationStatusDTO;
import com.edu.ozyegin.cs393.project.model.Reservation;
import com.edu.ozyegin.cs393.project.model.ReservationStatus;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")

public interface ReservationStatusMapper {
    ReservationStatusMapper INSTANCE = Mappers.getMapper(ReservationStatusMapper.class);
    ReservationStatusDTO entityToDTO(ReservationStatus car);
    ReservationStatus DTOToEntity(ReservationStatusDTO carDTO);
}
