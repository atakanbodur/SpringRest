package com.edu.ozyegin.cs393.project.dto;


import java.util.List;

public class MemberDTO {

    int id;
    String name;
    String address;
    String email;
    String phone;
    String drivLicenseNum;

    List<ReservationDTO> reservations;

}
