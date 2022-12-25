package com.edu.ozyegin.cs393.project.service;

import com.edu.ozyegin.cs393.project.dto.ReservationDTO;
import com.edu.ozyegin.cs393.project.mapper.ReservationMapper;
import com.edu.ozyegin.cs393.project.model.Reservation;
import com.edu.ozyegin.cs393.project.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository locationRepository;

    public List<ReservationDTO> findAll() {
        List<Reservation> locationList = locationRepository.findAll();
        List<ReservationDTO> dtos = new ArrayList<>();
        for (Reservation location : locationList) {
            dtos.add(ReservationMapper.INSTANCE.entityToDTO(location));
        }
        return dtos;
    }

    public ReservationDTO findById(int id) {
        Optional<Reservation> l = locationRepository.findById(id);
        if (l.isPresent()) {
            Reservation location = l.get();
            return ReservationMapper.INSTANCE.entityToDTO(location);
        }
        else return null;
    }

    public ReservationDTO save(ReservationDTO locationDTO) {
        Reservation a = locationRepository.save(ReservationMapper.INSTANCE.DTOToEntity(locationDTO));
        return ReservationMapper.INSTANCE.entityToDTO(a);
    }
}
