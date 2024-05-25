package com.excel.homeas.enums.forentity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ProductType {
	AC("AC"),
	WASHINGMACHINE("WASHINGMACHINE"),
	TV("TV");
	
	private final String productType;
}
