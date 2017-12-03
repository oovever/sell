package com.oovever.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品(包含类目)
 * @Author OovEver
 * @Date 2017/12/3 22:07
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer             categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
