package com.excel.homeas.exceptions.technician;


public class TechnicianNotFound extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public TechnicianNotFound(String message) {
		super(message);
	}
}
