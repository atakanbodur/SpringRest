package com.edu.ozyegin.cs393.project.controller;

import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.edu.ozyegin.cs393.project.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/cars")
@CrossOrigin
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/searchAvailable/{carType}/{transmissionType}")
    ResponseEntity searchAvailableCars(@PathVariable String carType, @PathVariable String transmissionType) {
        List<CarDTO> result = carService.searchAvailableCars(carType, transmissionType);
        if(result.size()!=0)
            return ResponseEntity.ok().body(result);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }

    @DeleteMapping("/remove-car/{barcode}")
    ResponseEntity removeCar(@PathVariable String barcode) {
        String s = carService.deleteCar(barcode);
        switch (s) {
            case "200":
                return ResponseEntity.ok().body(true);
            case "404":
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
            case "500":
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
            default:
                return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(false);
        }
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
