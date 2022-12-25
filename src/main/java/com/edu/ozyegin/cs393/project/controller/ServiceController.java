package com.edu.ozyegin.cs393.project.controller;

import com.edu.ozyegin.cs393.project.dto.ServiceDTO;
import com.edu.ozyegin.cs393.project.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/services")
@CrossOrigin
public class ServiceController {
    @Autowired
    ServiceService serviceService;

    @GetMapping(value = "")
    List<ServiceDTO> findAll() {
        return serviceService.findAll();
    }

    @GetMapping(value = "/{id}")
    ServiceDTO findById(@PathVariable int id) {
        return serviceService.findById(id);
    }

    @PostMapping("/save")
    ServiceDTO save(@RequestBody ServiceDTO locationDTO){
        return serviceService.save(locationDTO);
    }

}
