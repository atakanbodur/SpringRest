package com.edu.ozyegin.cs393.project.repository;

import com.edu.ozyegin.cs393.project.model.CarStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarStatusRepository extends JpaRepository<CarStatus, Integer> {


    Optional<CarStatus> findByName(String name);
}
