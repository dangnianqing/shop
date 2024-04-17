package com.shop.service.impl;

import com.shop.common.base.ServiceImpl;
import com.shop.model.SysRoleMenu;
import com.shop.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.model.SysRole;
import java.util.List;
import com.shop.mapper.SysRoleMapper;
import com.shop.service.SysRoleService;
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper,SysRole> implements SysRoleService{
    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    @Override
    public Boolean update(SysRole role) {
        sysRoleMenuService.insetRoleMenu(role.getId(),role.getMenuIds());
        return updateByIdSelective(role);
    }

    @Override
    public Boolean save(SysRole role) {
        sysRoleMenuService.insetRoleMenu(role.getId(),role.getMenuIds());
        return insertSelective(role);
    }

    @Override
    public Boolean delete(Long roleId) {
        sysRoleMenuService.deleteByRoleId(roleId);
        return this.deleteById(roleId);
    }

    @Override
    public Boolean deleteList(List<Long> roleIds) {
        sysRoleMenuService.deleteByRoleIds(roleIds);
        return baseMapper.deleteByIds(roleIds);
    }
}
