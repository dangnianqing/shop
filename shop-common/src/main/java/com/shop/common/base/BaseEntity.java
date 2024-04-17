package com.shop.common.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/10 16:21
 * @Description：
 */
@Data
public class BaseEntity {
    /**
     * 主键ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    protected Long id;
    /**
     * 创建者
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date createTime;

    /**
     * 创建时间
     */
    protected String createBy;

    /**
     * 修改者
     */
    protected String updateBy;

    /**
     * 修改时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date updateTime;

    /**
     * 删除标志 true/false 删除/未删除
     */
    protected Boolean deleteFlag;
}
