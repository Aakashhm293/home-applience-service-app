package com.excel.homeas.exceptions.technician;

import com.excel.homeas.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TechnicianExceptionHandler {
    @ExceptionHandler(TechnicianException.class)
    public ResponseEntity<Response<String>> technicianNotFound(RuntimeException exp) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Response.<String>builder()
                .data(null)
                .isError(true)
                .message("Technician Not Found")
                .build());
    }
}
