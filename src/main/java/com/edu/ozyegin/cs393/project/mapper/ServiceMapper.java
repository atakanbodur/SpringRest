package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.ReservationStatusDTO;
import com.edu.ozyegin.cs393.project.dto.ServiceDTO;
import com.edu.ozyegin.cs393.project.model.ReservationStatus;
import com.edu.ozyegin.cs393.project.model.Service;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")

public interface ServiceMapper {
    ServiceMapper INSTANCE = Mappers.getMapper(ServiceMapper.class);
    ServiceDTO entityToDTO(Service car);
    Service DTOToEntity(ServiceDTO carDTO);
}
