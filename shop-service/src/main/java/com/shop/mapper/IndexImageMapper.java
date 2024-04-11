package com.shop.mapper;

import com.shop.common.base.BaseMapper;
import com.shop.model.IndexImage;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IndexImageMapper extends BaseMapper<IndexImage> {

    List<IndexImage> selectList();
}