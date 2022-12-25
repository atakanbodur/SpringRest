package com.edu.ozyegin.cs393.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String code;
}
