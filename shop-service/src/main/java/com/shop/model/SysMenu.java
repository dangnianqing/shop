package com.shop.model;

import com.shop.common.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 管理系统菜单表
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SysMenu extends BaseEntity implements Serializable {
    /**
    * 菜单标题
    */
    private String name;

    /**
    * 层级
    */
    private Integer level;

    /**
    * 父id
    */
    private Long parentId;

    /**
    * 排序值
    */
    private Integer sortOrder;

    private static final long serialVersionUID = 1L;
}