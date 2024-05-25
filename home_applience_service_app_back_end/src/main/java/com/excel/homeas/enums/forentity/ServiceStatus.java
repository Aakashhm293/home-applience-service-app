package com.excel.homeas.enums.forentity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ServiceStatus {
	ACTIVE("ACTIVE"),
	ONQUEUE("ONQUEUE"),
	COMPLETED("COMPLETED");
	
	private final String serviceStatus;
}
