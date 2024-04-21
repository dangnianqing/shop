package com.shop.service.impl;

import com.shop.common.base.ServiceImpl;
import com.shop.model.SysMenu;
import com.shop.model.SysRoleMenu;
import com.shop.service.SysMenuService;
import com.shop.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.model.SysRole;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shop.mapper.SysRoleMapper;
import com.shop.service.SysRoleService;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
    @Autowired
    private SysRoleMenuService sysRoleMenuService;
    @Autowired
    private SysMenuService sysMenuService;

    @Override
    public Boolean update(SysRole role) {
        sysRoleMenuService.insetRoleMenu(role.getId(), role.getMenuIds());
        return updateByIdSelective(role);
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

    @Override
    public Boolean saveOrUpdate(SysRole role) {
        if (this.selectById(role.getId()) == null) {
            this.insert(role);
        } else {
            this.updateByIdSelective(role);
        }
        sysRoleMenuService.insetRoleMenu(role.getId(), role.getMenuIds());
        return true;
    }

    @Override
    public SysRole select(Long id) {
        SysRole sysRole = this.selectById(id);
        return sysRole;
    }

    @Override
    public Map<String, Object> selectMenuList(Long roleId) {
        return new HashMap<String, Object>() {{
            put("menuList", sysMenuService.selectListTree());
            put("roleMenuList", sysRoleMenuService.selectListByRoleId(roleId).stream().map(SysRoleMenu::getMenuId).toList());
        }};

    }

    @Override
    public Boolean saveRoleMenu(SysRole role) {
        sysRoleMenuService.insetRoleMenu(role.getId(), role.getMenuIds());
        return true;
    }
}
