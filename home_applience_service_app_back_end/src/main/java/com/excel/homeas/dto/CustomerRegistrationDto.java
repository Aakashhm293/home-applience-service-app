package com.excel.homeas.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRegistrationDto {

    private Integer customerId;
    private String customerFirstName;
    private String customerLastName;
    private String email;
    private String password;
    private String phoneNo;
    private String address;
}
