package com.edu.ozyegin.cs393.project.model;


import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String barcode;
    String licenseNum;
    int passengerCapacity;
    String brand;
    String model;
    int mileage;
    String transmissionType;
    double price; //daily

    @OneToOne
    CarType carType;

    @OneToOne
    CarStatus carStatus;
}
