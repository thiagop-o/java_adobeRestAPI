package com.viltgroup.adobeRestApi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Situation {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    private final String descricao;
}
