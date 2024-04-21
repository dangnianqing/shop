package com.shop.service;

import java.util.List;

import com.shop.common.base.IService;
import com.shop.model.SysMenu;
public interface SysMenuService extends IService<SysMenu> {


    List<SysMenu>selectListTree();


    List<SysMenu>selectParentId(Long parentId);

    Boolean delete(Long id);

    SysMenu select(Long id);

    Boolean saveOrUpdate(SysMenu menu);
}
