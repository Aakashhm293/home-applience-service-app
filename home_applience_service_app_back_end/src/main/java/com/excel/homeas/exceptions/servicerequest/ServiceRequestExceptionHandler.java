package com.excel.homeas.exceptions.servicerequest;

import com.excel.homeas.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ServiceRequestExceptionHandler {
    @ExceptionHandler(ServiceRequestException.class)
    public ResponseEntity<Response<String>> serviceRequestNotFound(RuntimeException exp) {
        return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder()
                .data(null)
                .isError(true)
                .message("Service Not Found")
                .build());
    }
}
