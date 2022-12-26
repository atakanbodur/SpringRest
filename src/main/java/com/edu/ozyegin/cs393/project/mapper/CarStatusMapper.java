package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.edu.ozyegin.cs393.project.dto.CarStatusDTO;
import com.edu.ozyegin.cs393.project.model.Car;
import com.edu.ozyegin.cs393.project.model.CarStatus;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")

public interface CarStatusMapper {
    CarStatusMapper INSTANCE = Mappers.getMapper(CarStatusMapper.class);
    CarStatusDTO entityToDTO(CarStatus car);
    CarStatus DTOToEntity(CarStatusDTO carDTO);
}
