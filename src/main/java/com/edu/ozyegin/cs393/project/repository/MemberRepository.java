package com.edu.ozyegin.cs393.project.repository;

import com.edu.ozyegin.cs393.project.model.Member;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

    @EntityGraph(attributePaths = {"reservations.car.carType", "reservations.car.carStatus", "reservations.pickUpLocation", "reservations.dropOffLocation", "reservations.reservationStatus"})
    @Override
    List<Member> findAll();

    @Override
    @EntityGraph(attributePaths = {"reservations.car.carType", "reservations.car.carStatus", "reservations.pickUpLocation", "reservations.dropOffLocation", "reservations.reservationStatus"})
    Optional<Member> findById(Integer integer);
}
