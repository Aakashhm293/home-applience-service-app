package com.excel.homeas.exceptions.applience;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excel.homeas.response.Response;

@RestControllerAdvice
public class ApplienceExceptionHandler {

	@ExceptionHandler(ApplienceException.class)
	public ResponseEntity<Response<String>> applienceNotFound(RuntimeException exp){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Response.<String>builder()
				.data(null)
				.isError(true)
				.message("Applience Not Found")
				.build());
	}
}
