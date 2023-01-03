package com.edu.ozyegin.cs393.project.repository;

import com.edu.ozyegin.cs393.project.model.Reservation;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    @Override
    @EntityGraph(attributePaths = {"member", "car.carType", "car.carStatus", "pickUpLocation", "dropOffLocation", "reservationStatus"})
    List<Reservation> findAll();

    @EntityGraph(attributePaths = {"member", "dropOffLocation"})
    Optional<Reservation> findByCar_id(Integer integer);

    @EntityGraph(attributePaths = {"car"})
    Optional<Reservation> findByCar_Barcode(String barcode);

    @EntityGraph(attributePaths = {"serviceList"})
    Optional<Reservation>  findByReservationNumber(String reservationNumber);

}
