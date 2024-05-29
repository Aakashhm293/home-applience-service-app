package com.excel.homeas.controller;

import com.excel.homeas.dto.ApplianceDto;
import com.excel.homeas.response.Response;
import com.excel.homeas.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/appliance")
public class ApplianceController {

    private final ApplicationService applicationService;
    @PostMapping("/save")
    public ResponseEntity<Integer> saveApplianceInfo(@RequestBody ApplianceDto dto) {
        Integer result = applicationService.saveApplienceDetails(dto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    
    @GetMapping("/get")
    public ResponseEntity<List<ApplianceDto>> getAllAppliances() {
        List<ApplianceDto> list = applicationService.getAllAppliances();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @PutMapping("/update")
    public ResponseEntity<Integer> updateApplianceDetails(@RequestBody ApplianceDto dto) {
        Integer details = applicationService.updateApplianceDetails(dto);
        return ResponseEntity.status(HttpStatus.OK).body(details);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Response<String>> deleteApplianceDetails(@RequestBody ApplianceDto dto) {
        String deleted = applicationService.deleteApplianceDetails(dto);
        return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder().data(deleted).isError(false).message("Deleted Successfully").build());
    }
}
