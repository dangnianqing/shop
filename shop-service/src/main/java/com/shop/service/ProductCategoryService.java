package com.shop.service;


import com.shop.common.base.IService;
import com.shop.model.ProductCategory;

import java.util.List;

public interface ProductCategoryService extends IService<ProductCategory>{


    List<ProductCategory> selectFather();
}
