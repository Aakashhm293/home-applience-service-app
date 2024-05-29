package com.excel.homeas.entity;

import com.excel.homeas.enums.ApplianceBrand;
import com.excel.homeas.enums.ProductType;
import com.excel.homeas.enums.WarrentyStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "appliances")
public class Applience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appliance_id")
	private Integer applienceId;

	@Column(name = "appliance_brand")
	@Enumerated(EnumType.STRING)
	private ApplianceBrand applienceBrand;

	@Column(name = "year_of_manufacturing")
	private LocalDate yearOfManufacturing;

	@Column(name = "product_type")
	@Enumerated(EnumType.STRING)
	private ProductType productType;

	@Column(name = "product_serial")
	private String serialNo;

	@Column(name = "warranty_status")
	@Enumerated(EnumType.STRING)
	private WarrentyStatus warrentyStatus;

	@PrimaryKeyJoinColumn(name = "customer_id")
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Customer customer;

	@PrimaryKeyJoinColumn(name = "service_requests_id")
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "applience")
	private ServiceRequests serviceRequests;
}
