package com.excel.homeas.exceptions.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excel.homeas.response.Response;

@RestControllerAdvice
public class CustomerExceptionHandler {
	
	@ExceptionHandler(CustomerNotFound.class)
	public ResponseEntity<Response<String>> customerNotFound(RuntimeException exp){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Response.<String>builder()
				.data(null)
				.isError(true)
				.message("Customer Not Found")
				.build());
	}
}
