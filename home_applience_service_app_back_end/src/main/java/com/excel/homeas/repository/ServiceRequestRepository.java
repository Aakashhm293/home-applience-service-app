package com.excel.homeas.repository;

import com.excel.homeas.entity.ServiceRequests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequests, Integer> {

}
