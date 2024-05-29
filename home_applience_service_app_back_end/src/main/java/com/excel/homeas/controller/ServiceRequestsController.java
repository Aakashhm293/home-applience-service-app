package com.excel.homeas.controller;

import com.excel.homeas.dto.ServiceRequestsDto;
import com.excel.homeas.response.Response;
import com.excel.homeas.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/service")
public class ServiceRequestsController {

    private final ApplicationService applicationService;

    @PostMapping("/save")
    public ResponseEntity<String> saveServiceRequests(@RequestBody ServiceRequestsDto dto) {
        String saveServiceRequest = applicationService.saveServiceRequest(dto);
        return ResponseEntity.status(HttpStatus.OK).body(saveServiceRequest);
    }

    @GetMapping("/all")
    public ResponseEntity<Response<Object>> getAllServiceRequests() {
        List<ServiceRequestsDto> allServiceRequests = applicationService.getAllServiceRequests();
        return ResponseEntity.status(HttpStatus.OK).body(Response.builder()
                .data(allServiceRequests)
                .isError(false)
                .message("Fetch was Successful")
                .build());
    }

    @PutMapping("/update")
    public ResponseEntity<Response<Integer>> updateServiceRequestDetails(@RequestBody ServiceRequestsDto dto) {
        Integer updatedServiceRequestDetails = applicationService.updateServiceRequestDetails(dto);
        return ResponseEntity.status(HttpStatus.OK).body(Response.<Integer>builder()
                .data(updatedServiceRequestDetails)
                .isError(false)
                .message("Updated Successfully")
                .build());
    }
}
