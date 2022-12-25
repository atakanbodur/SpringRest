package com.edu.ozyegin.cs393.project.model;

import javax.persistence.*;


@Entity
public class ReservationStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
}
