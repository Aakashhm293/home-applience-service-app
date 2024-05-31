package com.excel.homeas.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerLoginDto {
    private String email;
    private String password;
}
