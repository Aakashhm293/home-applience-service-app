package com.excel.homeas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.homeas.dto.CustomerRegistrationDto;
import com.excel.homeas.response.Response;
import com.excel.homeas.service.ApplicationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/customer")
@RestController
@CrossOrigin
public class CustomerController {

	private final ApplicationService applicationService;

	@PostMapping("/save")
	public ResponseEntity<Response<String>> registerCustomer(@RequestBody CustomerRegistrationDto dto) {
		String savedCustomerDetials = applicationService.saveCustomerDetials(dto);
		return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder()
				.data(savedCustomerDetials)
				.isError(false)
				.message("Inserted Successfully")
				.build());
	}
	
	@GetMapping("/get")
	public ResponseEntity<Response<CustomerRegistrationDto>> getAllCustomers(@RequestBody CustomerRegistrationDto dto){
		CustomerRegistrationDto allCustomerDetails = applicationService.getAllCustomerDetails(dto);
		return ResponseEntity.status(HttpStatus.OK).body(Response.<CustomerRegistrationDto>builder()
				.data(allCustomerDetails)
				.isError(false)
				.message("Here Is the Customer Date")
				.build());
	}
	
	@PutMapping("/update")
	public ResponseEntity<Response<String>> updateCustomerDetails(@RequestBody CustomerRegistrationDto dto){
		String updatedCustomerDetails = applicationService.updateCustomerDetails(dto);
		return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder()
				.data(updatedCustomerDetails)
				.isError(false)
				.message("Customer details are successfully updated")
				.build());
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Response<String>> deleteCustomerDetails(@RequestBody CustomerRegistrationDto dto){
		applicationService.deleteCustomerDetails(dto);
		return null;
	}

}
