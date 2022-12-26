package com.edu.ozyegin.cs393.project.repository;

import com.edu.ozyegin.cs393.project.model.CarType;
import com.edu.ozyegin.cs393.project.model.Location;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarTypeRepository extends JpaRepository<CarType, Integer> {


    Optional<CarType> findByName(String name);
}
