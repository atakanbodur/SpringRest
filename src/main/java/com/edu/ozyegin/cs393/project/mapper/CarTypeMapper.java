package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.edu.ozyegin.cs393.project.dto.CarStatusDTO;
import com.edu.ozyegin.cs393.project.dto.CarTypeDTO;
import com.edu.ozyegin.cs393.project.model.Car;
import com.edu.ozyegin.cs393.project.model.CarStatus;
import com.edu.ozyegin.cs393.project.model.CarType;
import org.mapstruct.factory.Mappers;

public interface CarTypeMapper {
    CarTypeMapper INSTANCE = Mappers.getMapper(CarTypeMapper.class);
    CarTypeDTO entityToDTO(CarType car);
    CarType DTOToEntity(CarTypeDTO carDTO);
}
