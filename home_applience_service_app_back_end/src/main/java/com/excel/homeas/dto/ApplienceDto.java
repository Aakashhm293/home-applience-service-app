package com.excel.homeas.dto;

import java.time.LocalDate;

import com.excel.homeas.enums.forentity.ApplienceBrand;
import com.excel.homeas.enums.forentity.ProductType;
import com.excel.homeas.enums.forentity.WarrentyStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplienceDto {
	
	private String email;
	private ApplienceBrand applienceBrand;
	private LocalDate yearOfManufacturing;
	private ProductType productType;
	private String serialNo;
	private WarrentyStatus warrentyStatus;
	
}
