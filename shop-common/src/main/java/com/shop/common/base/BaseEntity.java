package com.shop.common.base;

import java.util.Date;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/10 16:21
 * @Description：
 */
public class BaseEntity {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 创建者
     */
    private Date dateCreated;

    /**
     * 创建时间
     */
    private String createdBy;

    /**
     * 修改者
     */
    private String updatedBy;

    /**
     * 修改时间
     */
    private Date dateUpdated;

    /**
     * 删除标志 true/false 删除/未删除
     */
    private Boolean deleteFlag;
}
