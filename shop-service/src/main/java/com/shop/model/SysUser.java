package com.shop.model;

import com.shop.common.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 管理系统用户表
 */
@Data
@EqualsAndHashCode(callSuper=true)
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
    * 密码
    */
    private String password;

    private List<Long> roleIds;

    private static final long serialVersionUID = 1L;
}