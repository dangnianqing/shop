package com.shop.common.base;

import com.github.pagehelper.PageInfo;

import java.util.Collection;
import java.util.List;
import java.util.Map;

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

   PageInfo<T> selectPage(Integer currentPage,Integer pageSize,Map<String,Object> param);

    List<T>selectList(Map<String,Object> param);
}
