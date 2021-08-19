package com.viltgroup.adobeRestApi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Locale {
    PTBR("pt_br"),
    ENUS("en_us");

    private final String descricao;
}
