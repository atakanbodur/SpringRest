package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.EquipmentDTO;
import com.edu.ozyegin.cs393.project.model.Equipment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EquipmentMapper {
    EquipmentMapper INSTANCE = Mappers.getMapper(EquipmentMapper.class);
    EquipmentDTO entityToDTO(Equipment car);
    Equipment DTOToEntity(EquipmentDTO carDTO);
    List<EquipmentDTO> entityListToDtoList(List<Equipment> equipment);
}
