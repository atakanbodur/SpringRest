package com.edu.ozyegin.cs393.project.controller;

import com.edu.ozyegin.cs393.project.dto.LocationDTO;
import com.edu.ozyegin.cs393.project.repository.LocationRepository;
import com.edu.ozyegin.cs393.project.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/locations")
@CrossOrigin
public class LocationController {
    @Autowired
    LocationService locationService;

    @GetMapping(value = "/")
    List<LocationDTO> findAll() {
        return locationService.findAll();
    }

    @GetMapping(value = "/{id}")
    LocationDTO findById(@PathVariable int id) {
        return locationService.findById(id);
    }

    @PostMapping("/save")
    LocationDTO save(@RequestBody LocationDTO locationDTO){
        return locationService.save(locationDTO);
    }
}
