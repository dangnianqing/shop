package com.shop.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.shop.common.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.shop.common.base.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 管理系统用户表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUser extends BaseEntity implements Serializable {
    /**
     * 用户名
     */
    private String userName;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 头像
     */
    private String image;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 密码
     */
    private String password;

    private List<Long> roleIds;


    private static final long serialVersionUID = 1L;

    public SysUser(String userName) {
        this.userName = userName;
    }

    public SysUser(Long id, Integer status) {
        this.id = id;
        this.status = status;
    }

    public SysUser() {
    }

}