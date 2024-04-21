package com.shop.mapper;

import com.shop.common.base.BaseMapper;
import com.shop.model.SysUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

    Boolean deleteByUserId(@Param("userId") Long userId);

    Boolean deleteByUserIds(@Param("userIds") List<Long> userId);

    List<Long> selectByUserId(@Param("userId")Long userId);
}