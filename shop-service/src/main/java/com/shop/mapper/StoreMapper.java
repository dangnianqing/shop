package com.shop.mapper;

import com.shop.common.base.BaseMapper;
import com.shop.model.Store;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StoreMapper extends BaseMapper<Store>{
}