package com.excel.homeas.entity;

import java.time.LocalDate;

import com.excel.homeas.enums.forentity.ApplienceBrand;
import com.excel.homeas.enums.forentity.ProductType;
import com.excel.homeas.enums.forentity.WarrentyStatus;

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

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Applience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer applienceId;
	
	@Enumerated(EnumType.STRING)
	private ApplienceBrand applienceBrand;
	
	private LocalDate yearOfManufacturing;
	
	@Enumerated(EnumType.STRING)
	private ProductType productType;
	
	private String serialNo;
	
	@Enumerated(EnumType.STRING)
	private WarrentyStatus warrentyStatus;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private ServiceRequests serviceRequests;
}
