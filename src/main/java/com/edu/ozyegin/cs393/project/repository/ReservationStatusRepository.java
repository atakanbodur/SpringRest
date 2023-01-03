package com.edu.ozyegin.cs393.project.repository;

import com.edu.ozyegin.cs393.project.model.ReservationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationStatusRepository extends JpaRepository<ReservationStatus, Integer> {
    Optional<ReservationStatus> findByName(String name);
}
