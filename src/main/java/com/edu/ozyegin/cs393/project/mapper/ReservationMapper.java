package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.ReservationDTO;
import com.edu.ozyegin.cs393.project.model.Reservation;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservationMapper {
    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);
    ReservationDTO entityToDTO(Reservation car);
    @InheritInverseConfiguration
    @Mapping(target = "member", ignore = true)
    Reservation DTOToEntity(ReservationDTO carDTO);
    List<ReservationDTO> entityListToDtoList(List<Reservation> reservations);

}
