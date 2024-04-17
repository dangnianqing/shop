package com.shop.mapper;

import com.shop.common.base.BaseMapper;
import com.shop.model.SysUser;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {


    Boolean deleteByIds(@Param("userIds") List<Long> userIds);
}