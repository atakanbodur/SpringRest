package com.edu.ozyegin.cs393.project.service;

import com.edu.ozyegin.cs393.project.dto.LocationDTO;
import com.edu.ozyegin.cs393.project.mapper.LocationMapper;
import com.edu.ozyegin.cs393.project.model.Location;
import com.edu.ozyegin.cs393.project.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepository;

    public List<LocationDTO> findAll() {
        List<Location> locationList = locationRepository.findAll();
        List<LocationDTO> dtos = new ArrayList<>();
        for (Location location : locationList) {
            dtos.add(LocationMapper.INSTANCE.entityToDTO(location));
        }
        return dtos;
    }

    public LocationDTO findById(int id) {
        Optional<Location> l = locationRepository.findById(id);
        if (l.isPresent()) {
            Location location = l.get();
            return LocationMapper.INSTANCE.entityToDTO(location);
        }
        else return null;
    }

    public LocationDTO save(LocationDTO locationDTO) {
        Location a = locationRepository.save(LocationMapper.INSTANCE.DTOToEntity(locationDTO));
        return LocationMapper.INSTANCE.entityToDTO(a);
    }
}
