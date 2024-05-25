package com.excel.homeas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.homeas.entity.Applience;

public interface ApplienceRepository extends JpaRepository<Applience, Integer>{

	Optional<Applience> findByCustomerEmail(String email);
	
}
