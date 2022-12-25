package com.edu.ozyegin.cs393.project.model;

import javax.persistence.*;


import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String address;
    String email;
    String phone;
    String drivLicenseNum;

    @OneToMany(mappedBy = "member")
    List<Reservation> reservations;

}
