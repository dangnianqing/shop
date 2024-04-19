package com.shop.service.impl;

import com.shop.common.base.ServiceImpl;
import com.shop.model.SysUserRole;
import com.shop.service.SysUserRoleService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import com.shop.mapper.SysUserMapper;
import com.shop.model.SysUser;
import com.shop.service.SysUserService;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Autowired
    private SysUserRoleService userRoleService;

    @Override
    public Boolean deleteList(List<Long> userIds) {
        userRoleService.deleteByUserIds(userIds);
        return baseMapper.deleteByIds(userIds);
    }

    @Override
    public Boolean delete(Long userId) {
        userRoleService.deleteByUserId(userId);
        return this.deleteById(userId);
    }

    @Override
    public SysUser select(Long id) {
        SysUser user = this.selectById(id);
        user.setRoleIds(userRoleService.selectByUserId(id));
        return user;
    }

    @Override
    public Boolean saveOrUpdate(SysUser user) {
        if (this.selectById(user.getId()) == null) {
            this.insert(user);
        } else {
            this.updateByIdSelective(user);
        }

        return userRoleService.insertUserRole(user.getId(), user.getRoleIds());
    }
}
