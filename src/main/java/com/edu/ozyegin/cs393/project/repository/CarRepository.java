package com.edu.ozyegin.cs393.project.repository;

import com.edu.ozyegin.cs393.project.model.Car;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    @Override
    @EntityGraph(attributePaths = {"carType","carStatus"})
    List<Car> findAll();

    @Override
    @EntityGraph(attributePaths = {"carType","carStatus"})
    Optional<Car> findById(Integer integer);

    @EntityGraph(attributePaths = {"carType","carStatus"})
    List<Car> findAllByCarStatus_nameAndCarType_nameAndTransmissionType(String carStatusName, String carTypeName, String transmissionType);

    @EntityGraph(attributePaths = {"carType","carStatus"})
     Optional<Car> findAllBybarcodeAndCarStatus_name(String barcode, String carStatus);

    @EntityGraph(attributePaths = {"carType", "carStatus"})
    List<Car> findAllByCarStatus_name(String reserved);



    @EntityGraph(attributePaths = {"carStatus"})
    Optional<Car> findAllByBarcode(String barcodeNumber);
}
