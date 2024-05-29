package com.excel.homeas.repository;

import com.excel.homeas.entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TechnicianRepository extends JpaRepository<Technician, Integer> {

    Optional<Technician> findByEmail(String email);

}
