package com.excel.homeas.dto;

import com.excel.homeas.enums.ApplianceBrand;
import com.excel.homeas.enums.ProductType;
import com.excel.homeas.enums.WarrentyStatus;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplianceDto {

    private String email;
    private ApplianceBrand applianceBrand;
    private LocalDate yearOfManufacturing;
    private ProductType productType;
    private String serialNo;
    private WarrentyStatus warrentyStatus;

}
