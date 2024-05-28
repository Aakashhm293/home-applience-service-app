package com.excel.homeas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.homeas.dto.TechnicianLoginDto;
import com.excel.homeas.dto.TechnicianRegistrationDto;
import com.excel.homeas.service.ApplicationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/technician")
@RestController
@CrossOrigin
public class TechnicianController {

	private final ApplicationService applicationService;

	@PostMapping("/signup")
	public ResponseEntity<String> registerTechnician(@RequestBody TechnicianRegistrationDto dto) {
		String savedTechnicianDetails = applicationService.saveTechnicianDetails(dto);
		return ResponseEntity.status(HttpStatus.OK).body(savedTechnicianDetails);
	}

	@PostMapping("/signing")
	public ResponseEntity<Integer> loginTechnician(@RequestBody TechnicianLoginDto dto) {
		Integer login = applicationService.checkTechnicianLogin(dto);
		return ResponseEntity.status(HttpStatus.OK).body(login);
	}
}
