package com.oovever.dto;

import lombok.Getter;

/**
 * 购物车
 * @Author OovEver
 * @Date 2017/12/4 15:26
 */
@Getter
public class CartDTO {
    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
