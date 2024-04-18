package com.shop.common.base;

import java.io.Serializable;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/16 10:55
 * @Description：
 */
public class PageParam implements Serializable {
    /**
     * 页号
     */
    protected Integer pageNumber = 1;

    /**
     * 页面大小
     */
    protected Integer pageSize = 10;


    public Integer getPageNumber() {
        return pageNumber == null || pageNumber <= 0 ? 1 : pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize == null || pageNumber <= 0 ? 10 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    public PageParam(Integer pageNumber, Integer pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public PageParam() {
    }
}
