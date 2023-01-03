package com.edu.ozyegin.cs393.project.service;

import com.edu.ozyegin.cs393.project.dto.CarStatusDTO;
import com.edu.ozyegin.cs393.project.mapper.CarStatusMapper;
import com.edu.ozyegin.cs393.project.model.CarStatus;
import com.edu.ozyegin.cs393.project.repository.CarStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarStatusService {
    @Autowired
    CarStatusRepository carStatusRepository;

    public List<CarStatusDTO> findAll() {
        List<CarStatus> all = carStatusRepository.findAll();
        List<CarStatusDTO> dtos = new ArrayList<>();
        for (CarStatus carStatus : all) {
            dtos.add(CarStatusMapper.INSTANCE.entityToDTO(carStatus));
        }
        return dtos;
    }

    public CarStatusDTO findById(int id) {
        Optional<CarStatus> l = carStatusRepository.findById(id);
        if (l.isPresent()) {
            CarStatus carStatus = l.get();
            return CarStatusMapper.INSTANCE.entityToDTO(carStatus);
        } else return null;
    }

    public CarStatusDTO save(CarStatusDTO carStatusDTO) {
        CarStatus a = carStatusRepository.save(CarStatusMapper.INSTANCE.DTOToEntity(carStatusDTO));
        return CarStatusMapper.INSTANCE.entityToDTO(a);
    }
}
