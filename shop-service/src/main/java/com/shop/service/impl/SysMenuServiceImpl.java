package com.shop.service.impl;

import com.shop.common.base.BaseEntity;
import com.shop.common.base.ServiceImpl;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.shop.model.SysMenu;
import com.shop.mapper.SysMenuMapper;
import com.shop.service.SysMenuService;

@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {


    @Override
    public List<SysMenu> selectListTree() {
        List<SysMenu> list = this.selectList(null);
        return list.stream().filter(o -> o.getLevel() == 0).peek(o -> o.setChildren(initChild(o, list)))
                // 收集
                .collect(Collectors.toList());
    }

    @Override
    public List<SysMenu> selectParentId(Long parentId) {
        return baseMapper.selectParentId(parentId);
    }

    @Override
    public Boolean delete(Long id) {
        SysMenu menu = this.selectById(id);
        List<Long> removeIds = new ArrayList<>();
        if (menu.getLevel() == 0) {
            List<SysMenu> leve1 = this.selectParentId(menu.getId());
            List<SysMenu> leve2 = new ArrayList<>();
            for (SysMenu sysMenu : leve1) {
                leve2.addAll(this.selectParentId(sysMenu.getId()));
            }
            removeIds.add(menu.getId());
            removeIds.addAll(leve1.stream().map(BaseEntity::getId).toList());
            removeIds.addAll(leve2.stream().map(BaseEntity::getId).toList());
        } else if (menu.getLevel() == 1) {
            List<SysMenu> leve2 = this.selectParentId(menu.getId());
            removeIds.add(menu.getId());
            removeIds.addAll(leve2.stream().map(BaseEntity::getId).toList());
        } else if (menu.getLevel() == 2) {
            removeIds.add(menu.getId());
        }
        return baseMapper.deleteByIds(removeIds);
    }

    @Override
    public SysMenu select(Long id) {
        SysMenu sysMenu = this.selectById(id);
        if (sysMenu.getParentId() != 0) {
            sysMenu.setParentName(this.selectById(sysMenu.getParentId()).getName());
        }
        return sysMenu;
    }

    @Override
    public Boolean saveOrUpdate(SysMenu menu) {
        if (this.selectById(menu.getId()) == null) {
            this.insert(menu);
        } else {
            this.updateByIdSelective(menu);
        }
        return true;
    }

    private List<SysMenu> initChild(SysMenu model, List<SysMenu> menus) {
        return menus.stream().filter(o -> o.getParentId().equals(model.getId()))
                .peek(o -> o.setChildren(initChild(o, menus)))
                .sorted(Comparator.comparing(SysMenu::getSortOrder))
                .collect(Collectors.toList());
    }
}
