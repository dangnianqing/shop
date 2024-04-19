package com.shop.service;

import com.shop.common.base.IService;
import com.shop.model.SysRole;

import java.util.List;

public interface SysRoleService extends IService<SysRole> {


    Boolean update(SysRole user);

    Boolean delete(Long roleId);

    Boolean deleteList(List<Long> roleIds);

    Boolean saveOrUpdate(SysRole role);

    SysRole select(Long id);
}
