package com.excel.homeas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.homeas.dto.CustomerLoginDto;
import com.excel.homeas.dto.TechnicianRegistrationDto;
import com.excel.homeas.dto.TecnicianLoginDto;
import com.excel.homeas.response.Response;
import com.excel.homeas.service.ApplicationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/technician")
@RestController
public class TechnicianController {
	
	private final ApplicationService applicationService;

	@PostMapping("/save")
	public ResponseEntity<Integer> registerTechnician(@RequestBody TechnicianRegistrationDto dto) {
		Integer savedTechnicianDetials = applicationService.saveTechnicianDetials(dto);
		return ResponseEntity.status(HttpStatus.OK).body(savedTechnicianDetials);
	}
	

	
	
	@PostMapping("/login")
	@CrossOrigin(origins="*")
	public ResponseEntity<Response<Integer>> loginTechnician(@RequestBody TecnicianLoginDto dto){
		Integer login = applicationService.checkTechnicianLogin(dto);
		return ResponseEntity.status(HttpStatus.OK).body(Response.<Integer>builder()
				.data(login)
				.isError(false)
				.message("Done")
				.build());
	}
	
}
