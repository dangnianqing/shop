package com.shop.service;

import java.util.List;

import com.shop.common.base.IService;
import com.shop.model.SysUser;
public interface SysUserService extends IService<SysUser> {


    Boolean deleteList(List<Long> userIds);

    Boolean delete(Long userId);

    SysUser select(Long id);

    Boolean saveOrUpdate(SysUser user);
}
