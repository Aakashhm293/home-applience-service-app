package com.excel.homeas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.homeas.dto.TechnicianRegistrationDto;
import com.excel.homeas.service.ApplicationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/technician")
@RestController
public class TechnicianController {
	
	private final ApplicationService applicationService;

	@PostMapping("/save")
	public ResponseEntity<Integer> registerTechnician(TechnicianRegistrationDto dto) {
		Integer savedTechnicianDetials = applicationService.saveTechnicianDetials(dto);
		return ResponseEntity.status(HttpStatus.OK).body(savedTechnicianDetials);
	}
}
