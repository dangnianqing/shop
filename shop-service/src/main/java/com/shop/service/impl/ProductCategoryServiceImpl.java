package com.shop.service.impl;

import com.shop.common.base.ServiceImpl;
import org.springframework.stereotype.Service;


import com.shop.mapper.ProductCategoryMapper;


import com.shop.model.ProductCategory;
import com.shop.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {


}
