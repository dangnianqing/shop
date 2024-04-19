package com.shop.common.base;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/10 16:33
 * @Description：
 */
public class ServiceImpl<M extends BaseMapper<T>, T> implements IService<T> {
    @Autowired
    protected M baseMapper;

    @Override
    public boolean deleteById(Long id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public boolean insert(T t) {
        return baseMapper.insert(t);
    }

    @Override
    public boolean insertOrUpdate(T t) {
        return baseMapper.insertOrUpdate(t);
    }

    @Override
    public boolean insertOrUpdateSelective(T t) {
        return baseMapper.insertOrUpdateSelective(t);
    }

    @Override
    public boolean insertSelective(T t) {
        return baseMapper.insertSelective(t);
    }

    @Override
    public T selectById(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public boolean updateByIdSelective(T t) {
        return baseMapper.updateByIdSelective(t);
    }

    @Override
    public boolean updateById(T t) {
        return baseMapper.updateById(t);
    }

    @Override
    public boolean updateBatch(Collection<T> collection) {
        return baseMapper.updateBatch(collection);
    }

    @Override
    public boolean batchInsert(Collection<T> collection) {
        return baseMapper.batchInsert(collection);
    }

    @Override
    public boolean updateBatchSelective(Collection<T> collection) {
        return baseMapper.updateBatchSelective(collection);
    }

    @Override
    public PageInfo<T> selectPage(Integer pageNumber, Integer pageSize, Map<String, Object> param) {
        PageHelper.startPage(pageNumber, pageSize);
        return new PageInfo(this.selectList(param));
    }

    @Override
    public List<T> selectList(Map<String, Object> param) {
        if (param == null) {
            param = new HashMap<>();
        }
        return this.baseMapper.selectList(param);
    }
}
