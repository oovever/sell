package com.oovever.repository;

import com.oovever.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/12/3 17:00
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

}
