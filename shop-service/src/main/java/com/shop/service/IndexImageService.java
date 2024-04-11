package com.shop.service;

import com.shop.common.base.IService;
import java.util.List;
import com.shop.model.IndexImage;
import org.springframework.stereotype.Service;

@Service
public interface IndexImageService extends IService<IndexImage> {
    List<IndexImage> selectList();
}
