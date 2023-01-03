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
    CarTypeRepository carTypeRepository;

    public List<CarTypeDTO> findAll() {
        List<CarType> all = carTypeRepository.findAll();
        List<CarTypeDTO> dtos = new ArrayList<>();
        for (CarType carType : all) {
            dtos.add(CarTypeMapper.INSTANCE.entityToDTO(carType));
        }
        return dtos;
    }

    public CarTypeDTO findById(int id) {
        Optional<CarType> l = carTypeRepository.findById(id);
        if (l.isPresent()) {
            CarType carType = l.get();
            return CarTypeMapper.INSTANCE.entityToDTO(carType);
        }
        else return null;
    }

    public CarTypeDTO save(CarTypeDTO carTypeDTO) {
        CarType a = carTypeRepository.save(CarTypeMapper.INSTANCE.DTOToEntity(carTypeDTO));
        return CarTypeMapper.INSTANCE.entityToDTO(a);
    }
}
