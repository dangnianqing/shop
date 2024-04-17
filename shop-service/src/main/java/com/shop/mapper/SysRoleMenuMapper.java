package com.shop.mapper;

import com.shop.common.base.BaseMapper;
import com.shop.model.SysRoleMenu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

    Boolean deleteByRoleId(@Param("roleId") Long roleId);

    Boolean deleteByRoleIds(@Param("roleIds") List<Long> roleIds);
}