package com.edu.ozyegin.cs393.project.controller;

import com.edu.ozyegin.cs393.project.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/cars")
@CrossOrigin
public class CarController {
    @Autowired
    CarService carService;
}
