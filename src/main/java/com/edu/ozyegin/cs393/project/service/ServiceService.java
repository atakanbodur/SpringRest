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
    ServiceRepository serviceRepository;

    public List<ServiceDTO> findAll() {
        List<com.edu.ozyegin.cs393.project.model.Service> all = serviceRepository.findAll();
        List<ServiceDTO> dtos = new ArrayList<>();
        for (com.edu.ozyegin.cs393.project.model.Service service : all) {
            dtos.add(ServiceMapper.INSTANCE.entityToDTO(service));
        }
        return dtos;
    }

    public ServiceDTO findById(int id) {
        Optional<com.edu.ozyegin.cs393.project.model.Service> l = serviceRepository.findById(id);
        if (l.isPresent()) {
            com.edu.ozyegin.cs393.project.model.Service location = l.get();
            return ServiceMapper.INSTANCE.entityToDTO(location);
        }
        else return null;
    }

    public ServiceDTO save(ServiceDTO serviceDTO) {
        com.edu.ozyegin.cs393.project.model.Service a = serviceRepository.save(ServiceMapper.INSTANCE.DTOToEntity(serviceDTO));
        return ServiceMapper.INSTANCE.entityToDTO(a);
    }
}
