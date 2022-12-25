package com.edu.ozyegin.cs393.project.repository;

import com.edu.ozyegin.cs393.project.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
}
