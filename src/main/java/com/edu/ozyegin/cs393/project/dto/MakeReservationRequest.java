package com.edu.ozyegin.cs393.project.dto;

import java.util.List;

public class MakeReservationRequest {
    public String carBarcodeNumber ;
    public int dayCount ;
    public int memberID ;
    public int pickUpLocationCode ;
    public int dropOffLocationCode ;
    public List<Integer> equipmentLists ;
    public List<Integer> serviceList ;


}
