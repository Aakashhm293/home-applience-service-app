package com.excel.homeas.enums.forentity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Status {
	
	ACTIVE("ACTIVE"),
	LEFT("LEFT"),
	ABSCOND("ABSCOND");
	
	private final String status;
}
