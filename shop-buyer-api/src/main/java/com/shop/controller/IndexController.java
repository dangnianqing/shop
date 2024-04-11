package com.shop.controller;

import com.shop.common.result.RequestResult;
import com.shop.model.IndexImage;
import com.shop.service.IndexImageService;
import com.shop.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/10 16:47
 * @Description：
 */
@RequestMapping("/index")
@RestController
public class IndexController {

    @Autowired
    private IndexImageService indexImageService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @PostMapping("/getIndexImage")
    public RequestResult<List<IndexImage>> getIndexImage() {
        return RequestResult.success(indexImageService.selectList());
    }

    @GetMapping("/addd")
    public RequestResult<Boolean> addList() {
        return RequestResult.success(productCategoryService.add());
    }
}
