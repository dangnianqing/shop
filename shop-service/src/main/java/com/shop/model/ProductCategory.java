package com.shop.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.shop.common.base.BaseEntity;
import lombok.Data;

@Data
public class ProductCategory extends BaseEntity implements Serializable {

    /**
    * 分类名称
    */
    private String name;

    /**
    * 层级
    */
    private Integer level;

    /**
    * 父ID
    */
    private Long parentId;

    /**
    * 分类图标
    */
    private String image;

    /**
    * 排序值
    */
    private Integer sortOrder;

    /**
    * 佣金比例
    */
    private BigDecimal commissionRate;



    private static final long serialVersionUID = 1L;
}