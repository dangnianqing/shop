package com.shop.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.shop.common.base.ServiceImpl;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import com.shop.mapper.SysRoleMenuMapper;
import com.shop.model.SysRoleMenu;
import com.shop.service.SysRoleMenuService;

@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {


    @Override
    public Boolean insetRoleMenu(Long roleId, List<Long> menuIds) {
        List<SysRoleMenu> list = new ArrayList<>();
        this.deleteByRoleId(roleId);
        if (CollectionUtil.isNotEmpty(menuIds)) {
            for (Long menuId : menuIds) {
                SysRoleMenu roleMenu = new SysRoleMenu(roleId, menuId);
                list.add(roleMenu);
            }
            return batchInsert(list);
        }
        return true;
    }

    @Override
    public Boolean deleteByRoleId(Long roleId) {
        return baseMapper.deleteByRoleId(roleId);
    }

    @Override
    public Boolean deleteByRoleIds(List<Long> roleIds) {
        return baseMapper.deleteByRoleIds(roleIds);
    }

    @Override
    public List<SysRoleMenu> selectListByRoleId(Long roleId) {
        return baseMapper.selectListByRoleId(roleId);
    }
}
