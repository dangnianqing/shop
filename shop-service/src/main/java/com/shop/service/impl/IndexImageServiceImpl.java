package com.shop.service.impl;

import com.shop.common.base.ServiceImpl;
import com.shop.mapper.IndexImageMapper;
import com.shop.model.IndexImage;
import com.shop.service.IndexImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class IndexImageServiceImpl extends ServiceImpl<IndexImageMapper, IndexImage> implements IndexImageService {
    @Override
    public List<IndexImage> selectList() {
        return baseMapper.selectList();
    }
}
