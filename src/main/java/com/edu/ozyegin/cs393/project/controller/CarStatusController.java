package com.edu.ozyegin.cs393.project.controller;

import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.edu.ozyegin.cs393.project.dto.CarStatusDTO;
import com.edu.ozyegin.cs393.project.service.CarStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/cstatuses")
@CrossOrigin
public class CarStatusController {
    @Autowired
    CarStatusService carStatusService;

    @GetMapping(value = "")
    List<CarStatusDTO> findAll() {
        return carStatusService.findAll();
    }

    @GetMapping(value = "/{id}")
    CarStatusDTO findById(@PathVariable int id) {
        return carStatusService.findById(id);
    }

    @PostMapping("/save")
    CarStatusDTO save(@RequestBody CarStatusDTO locationDTO){
        return carStatusService.save(locationDTO);
    }

}
