package com.oovever.enums;

import lombok.Getter;

/**
 * @Author OovEver
 * @Date 2017/12/3 23:05
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
