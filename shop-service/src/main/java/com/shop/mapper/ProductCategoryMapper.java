package com.shop.mapper;

import com.shop.common.base.BaseMapper;
import com.shop.model.ProductCategory;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

}