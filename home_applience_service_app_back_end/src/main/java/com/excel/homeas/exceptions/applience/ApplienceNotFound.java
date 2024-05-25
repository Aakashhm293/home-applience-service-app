package com.excel.homeas.exceptions.applience;

import com.excel.homeas.enums.forexception.ExceptionEnum;

public class ApplienceNotFound extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ApplienceNotFound(String message) {
		super(message);
	}

	public ApplienceNotFound(ExceptionEnum appliencedetailsnotfound) {
		
	}
}
