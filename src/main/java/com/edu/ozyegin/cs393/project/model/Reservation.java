package com.edu.ozyegin.cs393.project.model;

import javax.persistence.*;

import java.util.Date;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    int id;

    //TODO: 8 digit string
    String reservationNumber;

    @OneToOne
    Car car;

    Date creationDate;
    Date pickupDate;
    Date dropOffDate;

    @OneToOne
    Location pickUpLocation;
    @OneToOne
    Location dropOffLocation;
    Date returnDate;

    @ManyToOne
    Member member;


}
