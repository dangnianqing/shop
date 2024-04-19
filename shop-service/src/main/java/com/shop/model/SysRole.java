package com.shop.model;

import com.shop.common.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 管理系统角色表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysRole extends BaseEntity implements Serializable {
    /**
     * 角色名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    private List<Long> menuIds;

    private static final long serialVersionUID = 1L;
}