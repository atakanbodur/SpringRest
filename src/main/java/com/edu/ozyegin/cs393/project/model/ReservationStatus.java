package com.edu.ozyegin.cs393.project.model;

import javax.persistence.*;


@Entity
@Table(name="reservation_status")
public class ReservationStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
