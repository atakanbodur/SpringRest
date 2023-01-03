package com.edu.ozyegin.cs393.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    int id;

    String reservationNumber;

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    Car car;

    Date creationDate;
    Date pickupDate;
    Date dropOffDate;

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "location_pickuo", referencedColumnName = "code")
    Location pickUpLocation;
    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "location_dropOff", referencedColumnName = "code")
    Location dropOffLocation;
    Date returnDate;

    @ManyToOne(fetch= FetchType.LAZY)
    @JsonIgnore
    Member member;
    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "reservation_Status", referencedColumnName = "id")
    ReservationStatus reservationStatus;
    @OneToMany(fetch= FetchType.LAZY)
    @JoinColumn(name = "service_list", referencedColumnName = "id")
    List<Service> serviceList;
    @OneToMany(fetch= FetchType.LAZY)
    @JoinColumn(name = "equipment_list", referencedColumnName = "id")
    List<Equipment> equipmentList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(Date dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(Location dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public Reservation setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
        return this;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public Reservation setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
        return this;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }
}
