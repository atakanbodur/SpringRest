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
    ReservationStatusRepository reservationStatusRepository;

    public List<ReservationStatusDTO> findAll() {
        List<ReservationStatus> all = reservationStatusRepository.findAll();
        List<ReservationStatusDTO> dtos = new ArrayList<>();
        for (ReservationStatus reservationStatus : all) {
            dtos.add(ReservationStatusMapper.INSTANCE.entityToDTO(reservationStatus));
        }
        return dtos;
    }

    public ReservationStatusDTO findById(int id) {
        Optional<ReservationStatus> l = reservationStatusRepository.findById(id);
        if (l.isPresent()) {
            ReservationStatus reservationStatus = l.get();
            return ReservationStatusMapper.INSTANCE.entityToDTO(reservationStatus);
        }
        else return null;
    }

    public ReservationStatusDTO save(ReservationStatusDTO reservationStatusDTO) {
        ReservationStatus a = reservationStatusRepository.save(ReservationStatusMapper.INSTANCE.DTOToEntity(reservationStatusDTO));
        return ReservationStatusMapper.INSTANCE.entityToDTO(a);
    }
}
