package com.oovever.enums;

import lombok.Getter;

/**
 * 商品状态
 * @Author OovEver
 * @Date 2017/12/3 18:26
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
