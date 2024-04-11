package com.shop.common.base;

import org.apache.ibatis.annotations.Param;

import java.util.Collection;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/10 16:34
 * @Description：
 */
public interface BaseMapper<T> {
    boolean deleteById(Long id);

    boolean insert(T t);

    boolean insertOrUpdate(T t);

    boolean insertOrUpdateSelective(T t);

    boolean insertSelective(T t);

    T selectById(Long id);

    boolean updateByIdSelective(T t);

    boolean updateById(T t);

    boolean updateBatch(Collection<T> Collection);

    boolean batchInsert(@Param("list") Collection<T> Collection);

    boolean updateBatchSelective(Collection<T> Collection);
}
