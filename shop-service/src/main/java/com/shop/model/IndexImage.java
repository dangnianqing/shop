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
     * 商品编码
     */
    private String imageName;

    /**
     * 商品名称
     */
    private String imagePath;

    /**
     * 商品大类
     */
    private byte[] imageIndex;



    private static final long serialVersionUID = 1L;
}