package com.edu.ozyegin.cs393.project.controller;


import com.edu.ozyegin.cs393.project.dto.EquipmentDTO;
import com.edu.ozyegin.cs393.project.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/equipments")
@CrossOrigin
public class EquipmentController {
    @Autowired
    EquipmentService equipmentService;

    @GetMapping(value = "")
    List<EquipmentDTO> findAll() {
        return equipmentService.findAll();
    }

    @GetMapping(value = "/{id}")
    EquipmentDTO findById(@PathVariable int id) {
        return equipmentService.findById(id);
    }

    @PostMapping("/save")
    EquipmentDTO save(@RequestBody EquipmentDTO locationDTO){
        return equipmentService.save(locationDTO);
    }

}
