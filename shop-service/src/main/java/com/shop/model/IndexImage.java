package com.shop.model;

import java.io.Serializable;
import java.util.Date;

import com.shop.common.base.BaseEntity;
import lombok.Data;

/**
 * 首页轮播图
 */
@Data
public class IndexImage extends BaseEntity implements Serializable {


    /**
     * 图片名称
     */
    private String imageName;

    /**
     * 图片地址
     */
    private String imagePath;

    /**
     * 图片顺序
     */
    private Integer imageIndex;


    private static final long serialVersionUID = 1L;
}