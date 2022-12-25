package com.edu.ozyegin.cs393.project.dto;

import jakarta.persistence.*;


public class CarDTO {
    int id;
    String barcode;
    String licenseNum;
    int passengerCapacity;
    String brand;
    String model;
    int mileage;
    String transmissionType;
    double price; //daily
    CarTypeDTO carType;
    CarStatusDTO carStatus;
}
