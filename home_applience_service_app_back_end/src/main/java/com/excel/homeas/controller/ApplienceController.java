package com.excel.homeas.controller;

import java.util.List;

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

import com.excel.homeas.dto.ApplienceDto;
import com.excel.homeas.response.Response;
import com.excel.homeas.service.ApplicationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/applience")
public class ApplienceController {

    private final ApplicationService applicationService;
    @PostMapping("/save")
    public ResponseEntity<Integer> saveApplienceInfo(@RequestBody ApplienceDto dto) {
        Integer result = applicationService.saveApplienceDetails(dto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    
    @GetMapping("/get")
    public ResponseEntity<List<ApplienceDto>> getAllAppliences() {
        List<ApplienceDto> list = applicationService.getAllAppliences();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @PutMapping("/update")
    public ResponseEntity<Integer> updateApplienceDetails(@RequestBody ApplienceDto dto) {
        Integer details = applicationService.updateApplienceDetails(dto);
        return ResponseEntity.status(HttpStatus.OK).body(details);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Response<String>> deleteApplienceDetails(@RequestBody ApplienceDto dto) {
        String deleted = applicationService.deleteApplienceDetails(dto);
        return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder().data(deleted).isError(false).message("Deleted Successfully").build());
    }
}
