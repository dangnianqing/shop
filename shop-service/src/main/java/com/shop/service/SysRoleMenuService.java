package com.shop.service;

import java.util.List;

import com.shop.common.base.IService;
import com.shop.model.SysRoleMenu;
public interface SysRoleMenuService extends IService<SysRoleMenu> {


    Boolean insetRoleMenu(Long id, List<Long> menuIds);

    Boolean deleteByRoleId(Long roleId);

    Boolean deleteByRoleIds(List<Long> roleIds);
}
