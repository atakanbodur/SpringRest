package com.edu.ozyegin.cs393.project.controller;

import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.edu.ozyegin.cs393.project.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/cars")
@CrossOrigin
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/searchAvailable/{carType}/{transmissionType}")
    List<CarDTO> searchAvailableCars(@PathVariable String carType,@PathVariable String transmissionType) {
        return carService.searchAvailableCars(carType, transmissionType);
    }

    @GetMapping(value = "")
    List<CarDTO> findAll() {
        return carService.findAll();
    }

    @GetMapping(value = "/{id}")
    CarDTO findById(@PathVariable int id) {
        return carService.findById(id);
    }

    @PostMapping("/save")
    CarDTO save(@RequestBody CarDTO locationDTO){
        return carService.save(locationDTO);
    }
}
