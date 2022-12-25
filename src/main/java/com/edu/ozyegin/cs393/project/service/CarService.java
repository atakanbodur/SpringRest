package com.edu.ozyegin.cs393.project.service;

import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.edu.ozyegin.cs393.project.mapper.CarMapper;
import com.edu.ozyegin.cs393.project.model.Car;
import com.edu.ozyegin.cs393.project.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public List<CarDTO> findAll() {
        List<Car> locationList = carRepository.findAll();
        List<CarDTO> dtos = new ArrayList<>();
        for (Car location : locationList) {
            dtos.add(CarMapper.INSTANCE.entityToDTO(location));
        }
        return dtos;
    }

    public CarDTO findById(int id) {
        Optional<Car> l = carRepository.findById(id);
        if (l.isPresent()) {
            Car location = l.get();
            return CarMapper.INSTANCE.entityToDTO(location);
        } else return null;
    }

    public CarDTO save(CarDTO locationDTO) {
        Car a = carRepository.save(CarMapper.INSTANCE.DTOToEntity(locationDTO));
        return CarMapper.INSTANCE.entityToDTO(a);
    }
}
