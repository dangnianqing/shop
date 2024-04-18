package com.shop.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.shop.common.base.ServiceImpl;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import com.shop.mapper.SysUserRoleMapper;
import com.shop.model.SysUserRole;
import com.shop.service.SysUserRoleService;

@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

    @Override
    public Boolean insertUserRole(Long userId, List<Long> roleIds) {
        List<SysUserRole> list = new ArrayList<>();
        this.deleteByUserId(userId);
        if (CollectionUtil.isNotEmpty(roleIds)) {
            roleIds.forEach(roleId -> {
                SysUserRole userRole = new SysUserRole(userId, roleId);
                list.add(userRole);
            });
            return batchInsert(list);
        }
        return true;

    }

    @Override
    public Boolean deleteByUserId(Long userId) {
        return baseMapper.deleteByUserId(userId);
    }

    @Override
    public Boolean deleteByUserIds(List<Long> userIds) {
        return baseMapper.deleteByUserIds(userIds);
    }

}
