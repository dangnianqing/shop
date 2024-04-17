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
    private Integer pageNumber = 1;

    /**
     * 页面大小
     */
    private Integer pageSize = 10;

    /**
     * 排序字段
     */
    private String sort;

    /**
     * 排序方式 asc/desc
     */
    private String order = "desc";


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


    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public PageParam(Integer pageNumber, Integer pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public PageParam() {
    }
}
