package com.edu.ozyegin.cs393.project.controller;


import com.edu.ozyegin.cs393.project.dto.CarTypeDTO;
import com.edu.ozyegin.cs393.project.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/ctypes")
@CrossOrigin
public class CarTypeController {
    @Autowired
    CarTypeService carStatusService;

    @GetMapping(value = "")
    List<CarTypeDTO> findAll() {
        return carStatusService.findAll();
    }

    @GetMapping(value = "/{id}")
    CarTypeDTO findById(@PathVariable int id) {
        return carStatusService.findById(id);
    }

    @PostMapping("/save")
    CarTypeDTO save(@RequestBody CarTypeDTO locationDTO) {
        return carStatusService.save(locationDTO);
    }
}
