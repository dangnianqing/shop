package com.shop.mapper;

import com.shop.common.base.BaseMapper;
import com.shop.model.SysMenu;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<SysMenu> selectParentId(@Param("parentId") Long parentId);

    boolean deleteByIds(@Param("removeIds") List<Long> removeIds);
}