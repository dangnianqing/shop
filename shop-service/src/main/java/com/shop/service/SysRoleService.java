package com.shop.service;

import com.shop.common.base.IService;
import com.shop.model.SysRole;

import java.util.List;

public interface SysRoleService extends IService<SysRole> {


    Boolean update(SysRole user);

    Boolean save(SysRole role);


    Boolean delete(Long roleId);

    Boolean deleteList(List<Long> roleIds);
}
