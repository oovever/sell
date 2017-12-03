package com.oovever.service;

import com.oovever.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/12/3 17:32
 */
public interface CategoryService {
//    查询一个
    ProductCategory findOne(Integer categoryId);
//  查询所有
    List<ProductCategory> findAll();
//通过type查询
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
//增加与更新
    ProductCategory save(ProductCategory productCategory);
}
