package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.MemberDTO;
import com.edu.ozyegin.cs393.project.dto.ReservationDTO;
import com.edu.ozyegin.cs393.project.model.Member;
import com.edu.ozyegin.cs393.project.model.Reservation;
import org.mapstruct.factory.Mappers;

public interface ReservationMapper {
    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);
    ReservationDTO entityToDTO(Reservation car);
    Reservation DTOToEntity(ReservationDTO carDTO);
}
