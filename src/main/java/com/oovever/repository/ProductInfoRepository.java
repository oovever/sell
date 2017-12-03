package com.oovever.repository;

import com.oovever.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/12/3 18:15
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
//    通过商品状态查询上架商品
    List<ProductInfo> findByProductStatus(Integer productStatus);

}
