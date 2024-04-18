package com.shop.common.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.stereotype.Component;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/17 16:46
 * @Description：
 */

public class SnowFlake {
    private static Snowflake snowflake;

    /**
     * 初始化配置
     *
     * @param workerId
     * @param datacenterId
     */
    public static void initialize(long workerId, long datacenterId) {
        snowflake = IdUtil.getSnowflake(workerId, datacenterId);
    }

    public static long getId() {
        return snowflake.nextId();
    }
}
