package com.excel.homeas.repository;

import com.excel.homeas.entity.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplianceRepository extends JpaRepository<Appliance, Integer> {

    Optional<Appliance> findByCustomerEmail(String email);

}
