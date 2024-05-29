package com.excel.homeas.dto;

import com.excel.homeas.enums.ServiceStatus;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceRequestsDto {

    private String email;
    private LocalDate createdOn;
    private LocalDate updatedOn;
    private LocalDate appointmentDate;
    private ServiceStatus serviceStatus;
    private String comment;
}
