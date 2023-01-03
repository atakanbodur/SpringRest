package com.edu.ozyegin.cs393.project.controller;


import com.edu.ozyegin.cs393.project.dto.GetAllRentedCarsResponseDTO;
import com.edu.ozyegin.cs393.project.dto.MakeReservationRequest;
import com.edu.ozyegin.cs393.project.dto.ReservationDTO;
import com.edu.ozyegin.cs393.project.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/reservations")
@CrossOrigin
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @GetMapping(value = "")
    List<ReservationDTO> findAll() {
        return reservationService.findAll();
    }

    @GetMapping(value = "/{id}")
    ReservationDTO findById(@PathVariable int id) {
        return reservationService.findById(id);
    }

    @PostMapping("/save")
    ReservationDTO save(@RequestBody ReservationDTO locationDTO) {
        return reservationService.save(locationDTO);
    }

    @PostMapping("/make-reservation")
    ResponseEntity makeReservation(@RequestBody MakeReservationRequest request) {

        ReservationDTO result = null;
        try {
            result = reservationService.makeReservation(request.carBarcodeNumber, request.dayCount, request.memberID, request.pickUpLocationCode, request.dropOffLocationCode, request.equipmentLists, request.serviceList);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.PARTIAL_CONTENT).build();
        }
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/get-all-rented")
    ResponseEntity getAllRentedCars() {

        List<GetAllRentedCarsResponseDTO> result = reservationService.getAllRentedCars();
        if (result.size() == 0) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("/add-service-to-reservation/{reservationNumber}/{serciveCode}")
    ResponseEntity addServiceToReservation(@PathVariable String reservationNumber,
                                           @PathVariable Integer serciveCode) {
        Boolean result = false;
        try {
            String res = reservationService.addServiceToReservation(reservationNumber, serciveCode);
            if ("OK".equals(res))
                return ResponseEntity.ok().body(true);
            else
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/add-equipment-to-reservation/{reservationNumber}/{equipmentCode}")
    ResponseEntity addEquipmentToReservation(@PathVariable String reservationNumber,
                                             @PathVariable Integer equipmentCode) {
        Boolean result = false;
        try {
            String res = reservationService.addEquipmentToReservation(reservationNumber, equipmentCode);
            if ("OK".equals(res))
                return ResponseEntity.ok().body(true);
            else
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/return-car/{reservationNumber}")
    ResponseEntity returnCar(@PathVariable String reservationNumber) {
        String res = reservationService.returnCar(reservationNumber);
        switch (res) {
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

    @DeleteMapping("/cancel-reservation/{reservationNumber}")
    ResponseEntity cancelReservation(@PathVariable String reservationNumber) {
        String s = reservationService.cancelReservation(reservationNumber);
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
}
