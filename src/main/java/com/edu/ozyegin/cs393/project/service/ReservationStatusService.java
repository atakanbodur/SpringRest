package com.edu.ozyegin.cs393.project.service;

import com.edu.ozyegin.cs393.project.dto.ReservationStatusDTO;
import com.edu.ozyegin.cs393.project.mapper.ReservationStatusMapper;
import com.edu.ozyegin.cs393.project.model.ReservationStatus;
import com.edu.ozyegin.cs393.project.repository.ReservationStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationStatusService {
    @Autowired
    ReservationStatusRepository locationRepository;

    public List<ReservationStatusDTO> findAll() {
        List<ReservationStatus> locationList = locationRepository.findAll();
        List<ReservationStatusDTO> dtos = new ArrayList<>();
        for (ReservationStatus location : locationList) {
            dtos.add(ReservationStatusMapper.INSTANCE.entityToDTO(location));
        }
        return dtos;
    }

    public ReservationStatusDTO findById(int id) {
        Optional<ReservationStatus> l = locationRepository.findById(id);
        if (l.isPresent()) {
            ReservationStatus location = l.get();
            return ReservationStatusMapper.INSTANCE.entityToDTO(location);
        }
        else return null;
    }

    public ReservationStatusDTO save(ReservationStatusDTO locationDTO) {
        ReservationStatus a = locationRepository.save(ReservationStatusMapper.INSTANCE.DTOToEntity(locationDTO));
        return ReservationStatusMapper.INSTANCE.entityToDTO(a);
    }
}
