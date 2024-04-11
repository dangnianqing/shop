package com.shop.common.result;

import lombok.Data;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/11 09:01
 * @Description：
 */
public enum ResultEnum implements  IResult{
    SUCCESS(200, "操作成功 (*^__^*)"),
    VALIDATE_FAILED(2002, "参数校验失败"),
    COMMON_FAILED(2003, "接口调用失败"),
    FORBIDDEN(2004, "没有权限访问资源");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
