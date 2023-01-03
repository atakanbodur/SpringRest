package com.edu.ozyegin.cs393.project.dto;


import java.util.Date;
import java.util.List;

public class ReservationDTO {

    int id;
    String reservationNumber;
    CarDTO car;
    Date creationDate;
    Date pickupDate;
    Date dropOffDate;
    LocationDTO pickUpLocation;
    LocationDTO dropOffLocation;
    Date returnDate;
    ReservationStatusDTO reservationStatus;
    List<ServiceDTO> serviceList;
    List<EquipmentDTO> equipmentList;
    double totalAmount;

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

    public CarDTO getCar() {
        return car;
    }

    public void setCar(CarDTO car) {
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

    public LocationDTO getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(LocationDTO pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public LocationDTO getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(LocationDTO dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public ReservationStatusDTO getReservationStatus() {
        return reservationStatus;
    }

    public ReservationDTO setReservationStatus(ReservationStatusDTO reservationStatus) {
        this.reservationStatus = reservationStatus;
        return this;
    }

    public List<ServiceDTO> getServiceList() {
        return serviceList;
    }

    public ReservationDTO setServiceList(List<ServiceDTO> serviceList) {
        this.serviceList = serviceList;
        return this;
    }

    public List<EquipmentDTO> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<EquipmentDTO> equipmentList) {
        this.equipmentList = equipmentList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public ReservationDTO setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
}
