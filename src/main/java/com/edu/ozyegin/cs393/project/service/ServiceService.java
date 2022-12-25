package com.edu.ozyegin.cs393.project.service;

import com.edu.ozyegin.cs393.project.dto.ServiceDTO;
import com.edu.ozyegin.cs393.project.mapper.ServiceMapper;
import com.edu.ozyegin.cs393.project.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceService {
    @Autowired
    ServiceRepository locationRepository;

    public List<ServiceDTO> findAll() {
        List<com.edu.ozyegin.cs393.project.model.Service> locationList = locationRepository.findAll();
        List<ServiceDTO> dtos = new ArrayList<>();
        for (com.edu.ozyegin.cs393.project.model.Service location : locationList) {
            dtos.add(ServiceMapper.INSTANCE.entityToDTO(location));
        }
        return dtos;
    }

    public ServiceDTO findById(int id) {
        Optional<com.edu.ozyegin.cs393.project.model.Service> l = locationRepository.findById(id);
        if (l.isPresent()) {
            com.edu.ozyegin.cs393.project.model.Service location = l.get();
            return ServiceMapper.INSTANCE.entityToDTO(location);
        }
        else return null;
    }

    public ServiceDTO save(ServiceDTO locationDTO) {
        com.edu.ozyegin.cs393.project.model.Service a = locationRepository.save(ServiceMapper.INSTANCE.DTOToEntity(locationDTO));
        return ServiceMapper.INSTANCE.entityToDTO(a);
    }
}
