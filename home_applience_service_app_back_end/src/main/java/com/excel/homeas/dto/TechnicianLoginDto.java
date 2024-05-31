package com.excel.homeas.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TechnicianLoginDto {
    private String email;
    private String password;
}
