package com.shop.mapper;

import com.shop.common.base.BaseMapper;
import com.shop.model.SysRole;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

    Boolean deleteByIds(@Param("roleIds") List<Long> roleIds);
}