package com.excel.homeas.entity;

import java.time.LocalDate;

import com.excel.homeas.enums.forentity.ServiceStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceRequests {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serviceId;
	private LocalDate createdOn;
	private LocalDate updatedOn;
	private LocalDate appointmentDate;

	@Enumerated(EnumType.STRING)
	private ServiceStatus serviceStatus;
	private String comment;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Customer customer;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "serviceRequests")
	private Technician technician;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "serviceRequests")
	private Applience applience;
}
