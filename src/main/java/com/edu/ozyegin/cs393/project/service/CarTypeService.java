package com.edu.ozyegin.cs393.project.service;


import com.edu.ozyegin.cs393.project.dto.CarTypeDTO;
import com.edu.ozyegin.cs393.project.mapper.CarTypeMapper;
import com.edu.ozyegin.cs393.project.model.CarType;
import com.edu.ozyegin.cs393.project.repository.CarTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarTypeService {
    @Autowired
    CarTypeRepository locationRepository;

    public List<CarTypeDTO> findAll() {
        List<CarType> locationList = locationRepository.findAll();
        List<CarTypeDTO> dtos = new ArrayList<>();
        for (CarType location : locationList) {
            dtos.add(CarTypeMapper.INSTANCE.entityToDTO(location));
        }
        return dtos;
    }

    public CarTypeDTO findById(int id) {
        Optional<CarType> l = locationRepository.findById(id);
        if (l.isPresent()) {
            CarType location = l.get();
            return CarTypeMapper.INSTANCE.entityToDTO(location);
        }
        else return null;
    }

    public CarTypeDTO save(CarTypeDTO locationDTO) {
        CarType a = locationRepository.save(CarTypeMapper.INSTANCE.DTOToEntity(locationDTO));
        return CarTypeMapper.INSTANCE.entityToDTO(a);
    }
}
