package com.shop.model;

import java.io.Serializable;
import java.util.Date;

import com.shop.common.base.BaseEntity;
import lombok.Data;

@Data
public class Store extends BaseEntity implements Serializable {


    /**
    * 店铺名称
    */
    private String storeName;

    /**
    * 店铺状态
    */
    private String storeDisable;

    /**
    * 店铺关闭时间
    */
    private Date storeEndTime;

    /**
    * 店铺logo
    */
    private String storeLogo;

    /**
    * 详细地址
    */
    private String storeAddressDetail;

    /**
    * 地址id
    */
    private String storeAddressIdPath;

    /**
    * 地址名称
    */
    private String storeAddressPath;

    /**
    * 经纬度
    */
    private String storeCenter;

    /**
    * 店铺简介
    */
    private String storeDesc;

    /**
    * 商品数量
    */
    private Integer productNum;

    /**
    * 收藏数量
    */
    private Integer collectionNum;


    private static final long serialVersionUID = 1L;
}