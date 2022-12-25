package com.edu.ozyegin.cs393.project.controller;

import com.edu.ozyegin.cs393.project.dto.ReservationStatusDTO;
import com.edu.ozyegin.cs393.project.service.ReservationStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/equipments")
@CrossOrigin
public class ReservationStatusController {
    @Autowired
    ReservationStatusService reservationStatusService;

    @GetMapping(value = "")
    List<ReservationStatusDTO> findAll() {
        return reservationStatusService.findAll();
    }

    @GetMapping(value = "/{id}")
    ReservationStatusDTO findById(@PathVariable int id) {
        return reservationStatusService.findById(id);
    }

    @PostMapping("/save")
    ReservationStatusDTO save(@RequestBody ReservationStatusDTO locationDTO){
        return reservationStatusService.save(locationDTO);
    }

}
