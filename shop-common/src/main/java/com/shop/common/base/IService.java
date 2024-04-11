package com.shop.common.base;

import java.util.Collection;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/10 16:33
 * @Description：
 */
public interface IService<T> {
    boolean deleteById(Long id);

    boolean insert(T t);

    boolean insertOrUpdate(T t);

    boolean insertOrUpdateSelective(T t);

    boolean insertSelective(T t);

    T selectById(Long id);

    boolean updateByIdSelective(T t);

    boolean updateById(T t);

    boolean updateBatch(Collection<T> collection);

    boolean batchInsert(Collection<T> collection);

    boolean updateBatchSelective(Collection<T> collection);
}