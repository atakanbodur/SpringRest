package com.edu.ozyegin.cs393.project.controller;


import com.edu.ozyegin.cs393.project.dto.ReservationDTO;
import com.edu.ozyegin.cs393.project.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/reservations")
@CrossOrigin
public class ReservationController {
    @Autowired
    ReservationService locationService;

    @GetMapping(value = "")
    List<ReservationDTO> findAll() {
        return locationService.findAll();
    }

    @GetMapping(value = "/{id}")
    ReservationDTO findById(@PathVariable int id) {
        return locationService.findById(id);
    }

    @PostMapping("/save")
    ReservationDTO save(@RequestBody ReservationDTO locationDTO){
        return locationService.save(locationDTO);
    }
}
