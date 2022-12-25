package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.EquipmentDTO;
import com.edu.ozyegin.cs393.project.dto.LocationDTO;
import com.edu.ozyegin.cs393.project.model.Equipment;
import com.edu.ozyegin.cs393.project.model.Location;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface LocationMapper {
    LocationMapper INSTANCE = Mappers.getMapper(LocationMapper.class);
    LocationDTO entityToDTO(Location car);
    Location DTOToEntity(LocationDTO carDTO);
}
