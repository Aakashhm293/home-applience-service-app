package com.excel.homeas.controller;

import com.excel.homeas.dto.CustomerLoginDto;
import com.excel.homeas.dto.CustomerRegistrationDto;
import com.excel.homeas.response.Response;
import com.excel.homeas.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/customer")
@RestController
@CrossOrigin
public class CustomerController {

    private final ApplicationService applicationService;

    @PostMapping("/save")
    public ResponseEntity<Response<Integer>> registerCustomer(@RequestBody CustomerRegistrationDto dto) {
        Integer savedCustomerDetials = applicationService.saveCustomerDetials(dto);
        return ResponseEntity.status(HttpStatus.OK).body(Response.<Integer>builder()
                .data(savedCustomerDetials)
                .isError(false)
                .message("Successfully Registered")
                .build());
    }

    @GetMapping("/get")
    public ResponseEntity<Response<CustomerRegistrationDto>> getAllCustomers(@RequestBody CustomerRegistrationDto dto) {
        CustomerRegistrationDto allCustomerDetails = applicationService.getAllCustomerDetails(dto);
        return ResponseEntity.status(HttpStatus.OK).body(Response.<CustomerRegistrationDto>builder()
                .data(allCustomerDetails)
                .isError(false)
                .message("Here Is the Customer Date")
                .build());
    }

    @PutMapping("/update")
    public ResponseEntity<Response<String>> updateCustomerDetails(@RequestBody CustomerRegistrationDto dto) {
        String updatedCustomerDetails = applicationService.updateCustomerDetails(dto);
        return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder()
                .data(updatedCustomerDetails)
                .isError(false)
                .message("Customer details are successfully updated")
                .build());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Response<String>> deleteCustomerDetails(@RequestBody CustomerRegistrationDto dto) {
        applicationService.deleteCustomerDetails(dto);
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<Response<Integer>> loginCustomer(@RequestBody CustomerLoginDto dto) {
        Integer login = applicationService.checkCustomerLogin(dto);
        return ResponseEntity.status(HttpStatus.OK).body(Response.<Integer>builder()
                .data(login)
                .isError(false)
                .message("Done")
                .build());
    }

}
