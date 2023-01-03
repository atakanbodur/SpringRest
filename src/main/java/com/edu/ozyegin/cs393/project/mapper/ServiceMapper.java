package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.ServiceDTO;
import com.edu.ozyegin.cs393.project.model.Service;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServiceMapper {
    ServiceMapper INSTANCE = Mappers.getMapper(ServiceMapper.class);
    ServiceDTO entityToDTO(Service service);
    Service DTOToEntity(ServiceDTO serviceDTO);
    List<ServiceDTO> entityListToDtoList(List<Service> service);
}
