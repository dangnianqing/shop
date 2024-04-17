package com.shop.service;

import java.util.List;

import com.shop.common.base.IService;
import com.shop.model.SysUserRole;
public interface SysUserRoleService extends IService<SysUserRole> {


    Boolean insertUserRole(Long userId, List<Long> roleIds);

    Boolean deleteByUserId(Long userId);

    Boolean deleteByUserIds(List<Long> userIds);
}
