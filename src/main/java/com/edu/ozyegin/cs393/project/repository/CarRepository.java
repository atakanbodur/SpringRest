package com.edu.ozyegin.cs393.project.repository;

import com.edu.ozyegin.cs393.project.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    List<Car> findAllByCarStatus_nameAndCarType_nameAndTransmissionType(String carStatusName, String carTypeName, String transmissionType);
}
