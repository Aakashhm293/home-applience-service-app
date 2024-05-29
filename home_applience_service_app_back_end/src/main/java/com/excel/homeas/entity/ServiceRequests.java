package com.excel.homeas.entity;

import com.excel.homeas.enums.ServiceStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceRequests {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "service_id")
	private Integer serviceId;

	@Column(name = "created_on")
	private LocalDate createdOn;

	@Column(name = "updated_on")
	private LocalDate updatedOn;

	@Column(name = "appointment_date")
	private LocalDate appointmentDate;

	@Enumerated(EnumType.STRING)
	@Column(name = "service_status")
	private ServiceStatus serviceStatus;

	@Column(name = "comments")
	private String comment;

	@PrimaryKeyJoinColumn(name = "customer_id")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Customer customer;

	@PrimaryKeyJoinColumn(name = "appliance_id")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Applience applience;
}
