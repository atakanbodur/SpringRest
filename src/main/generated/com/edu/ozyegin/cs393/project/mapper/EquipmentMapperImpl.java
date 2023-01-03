package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.EquipmentDTO;
import com.edu.ozyegin.cs393.project.model.Equipment;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-02T15:08:59+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class EquipmentMapperImpl implements EquipmentMapper {

    @Override
    public EquipmentDTO entityToDTO(Equipment car) {
        if ( car == null ) {
            return null;
        }

        EquipmentDTO equipmentDTO = new EquipmentDTO();

        equipmentDTO.setId( car.getId() );
        equipmentDTO.setName( car.getName() );
        equipmentDTO.setPrice( car.getPrice() );

        return equipmentDTO;
    }

    @Override
    public Equipment DTOToEntity(EquipmentDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Equipment equipment = new Equipment();

        equipment.setId( carDTO.getId() );
        equipment.setName( carDTO.getName() );
        equipment.setPrice( carDTO.getPrice() );

        return equipment;
    }
}
