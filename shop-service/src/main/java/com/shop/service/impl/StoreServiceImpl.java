package com.shop.service.impl;

import com.shop.common.base.ServiceImpl;
import org.springframework.stereotype.Service;

import com.shop.mapper.StoreMapper;
import com.shop.model.Store;
import com.shop.service.StoreService;


@Service
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements StoreService {

}
