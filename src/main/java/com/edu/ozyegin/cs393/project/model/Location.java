package com.edu.ozyegin.cs393.project.model;
import javax.persistence.*;


@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int code;
    String name;
    String address;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
