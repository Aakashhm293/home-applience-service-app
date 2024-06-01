package com.excel.homeas.repository;

import com.excel.homeas.entity.ServiceRequests;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequests, Integer> {

	Optional<ServiceRequests> findByCustomerEmail(String email);

}
