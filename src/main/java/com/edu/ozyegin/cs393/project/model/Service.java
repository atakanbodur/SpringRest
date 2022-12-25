package com.edu.ozyegin.cs393.project.model;

import javax.persistence.*;


@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    double price;
}
