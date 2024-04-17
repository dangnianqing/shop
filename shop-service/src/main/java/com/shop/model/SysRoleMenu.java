package com.shop.model;

import com.shop.common.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 管理系统角色菜单表
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SysRoleMenu extends BaseEntity implements Serializable {
    /**
    * 角色ID
    */
    private Long roleId;

    /**
    * 菜单ID
    */
    private Long menuId;

    private static final long serialVersionUID = 1L;

    public SysRoleMenu(Long roleId, Long menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

    public SysRoleMenu() {
    }
}