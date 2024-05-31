package com.excel.homeas.exceptions.customer;

import com.excel.homeas.constant.ApplicationConstants;
import com.excel.homeas.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(CustomerException.class)
    public ResponseEntity<Response<String>> customerNotFound(RuntimeException exp) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Response.<String>builder()
                .data(null)
                .isError(true)
                .message(ApplicationConstants.CUSTOMER_DETAILS_ALREADY_EXISTS)
                .build());
    }
}
