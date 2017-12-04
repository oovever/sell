package com.oovever.service;

import com.oovever.dataobject.ProductInfo;
import com.oovever.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * @Author OovEver
 * @Date 2017/12/3 18:21
 */
public interface ProductService {
//    查找一个
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();
    //分页查询
    Page<ProductInfo> findAll(Pageable pageable);
    //保存
    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);


}
