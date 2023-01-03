package com.edu.ozyegin.cs393.project.service;


import com.edu.ozyegin.cs393.project.dto.EquipmentDTO;
import com.edu.ozyegin.cs393.project.mapper.EquipmentMapper;
import com.edu.ozyegin.cs393.project.model.Equipment;
import com.edu.ozyegin.cs393.project.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EquipmentService {
    @Autowired
    EquipmentRepository equipmentRepository;

    public List<EquipmentDTO> findAll() {
        List<Equipment> all = equipmentRepository.findAll();
        List<EquipmentDTO> dtos = new ArrayList<>();
        for (Equipment equipment : all) {
            dtos.add(EquipmentMapper.INSTANCE.entityToDTO(equipment));
        }
        return dtos;
    }

    public EquipmentDTO findById(int id) {
        Optional<Equipment> l = equipmentRepository.findById(id);
        if (l.isPresent()) {
            Equipment equipment = l.get();
            return EquipmentMapper.INSTANCE.entityToDTO(equipment);
        }
        else return null;
    }

    public EquipmentDTO save(EquipmentDTO locationDTO) {
        Equipment a = equipmentRepository.save(EquipmentMapper.INSTANCE.DTOToEntity(locationDTO));
        return EquipmentMapper.INSTANCE.entityToDTO(a);
    }
}
