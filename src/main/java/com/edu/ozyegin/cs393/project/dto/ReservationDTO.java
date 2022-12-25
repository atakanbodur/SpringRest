package com.edu.ozyegin.cs393.project.dto;


import java.util.Date;

public class ReservationDTO {

    int id;
    //TODO: 8 digit string
    String reservationNumber;
    CarDTO car;
    Date creationDate;
    Date pickupDate;
    Date dropOffDate;
    LocationDTO pickUpLocation;
    LocationDTO dropOffLocation;
    Date returnDate;
    MemberDTO member;


}
