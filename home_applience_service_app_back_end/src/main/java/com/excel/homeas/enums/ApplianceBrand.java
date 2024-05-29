package com.excel.homeas.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ApplianceBrand {
    LG("LG"),
    SONY("SONY"),
    BOSCH("BOSCH");

    private final String applienceBrand;
}
