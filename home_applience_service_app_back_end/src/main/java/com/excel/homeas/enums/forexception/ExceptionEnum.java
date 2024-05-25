package com.excel.homeas.enums.forexception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ExceptionEnum {
	CUSTOMERNOTFOUND("CUSTOMER_NOT_FOUND"),
	TECHNICIANNOTFOUND("TECHNICIAN_NOT_FOUND"),
	APPLIENCEDETAILSNOTFOUND("APPLIENCE_DETAILS_NOT_FOUND"),
	SERVICEREQUESTNOTFOUND("SERVICE_REQUEST_NOT_FOUND"),
	SOMETHINGWENTWRONG("SOMETHINGWENTWRONG");
	
	private final String excepEnumString;
}
