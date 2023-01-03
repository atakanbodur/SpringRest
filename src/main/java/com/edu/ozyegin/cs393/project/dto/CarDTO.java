package com.edu.ozyegin.cs393.project.dto;


import com.edu.ozyegin.cs393.project.model.CarStatus;
import com.edu.ozyegin.cs393.project.model.CarType;

public class CarDTO {
    int id;
    String barcode;
    String licenseNum;
    int passengerCapacity;
    String brand;
    String model;
    int mileage;
    String transmissionType;
    double price; //daily
    CarType carType;
    CarStatus carStatus;
    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id=" + id +
                ", barcode='" + barcode + '\'' +
                ", licenseNum='" + licenseNum + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", transmissionType='" + transmissionType + '\'' +
                ", price=" + price +
                ", carType=" + carType +
                ", carStatus=" + carStatus +
                '}';
    }
}
