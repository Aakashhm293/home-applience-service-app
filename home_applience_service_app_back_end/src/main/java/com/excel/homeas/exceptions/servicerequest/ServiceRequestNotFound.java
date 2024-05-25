package com.excel.homeas.exceptions.servicerequest;


public class ServiceRequestNotFound extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ServiceRequestNotFound(String message) {
		super(message);
	}
}
