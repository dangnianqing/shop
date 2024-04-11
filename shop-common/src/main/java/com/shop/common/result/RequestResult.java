package com.shop.common.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/10 16:53
 * @Description：
 */
//统一返回数据结构
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestResult<T> {
    private Integer code;
    private String message;
    private T data;
    @JsonFormat(
            pattern = "yyyy/MM/dd HH:mm:ss:SSS",
            timezone = "GMT+8"
    )
    private final Date currentTime = new Date();



    public static <T> RequestResult<T> success(T data) {
        return new RequestResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    public static <T> RequestResult<T> success(String message, T data) {
        return new RequestResult<>(ResultEnum.SUCCESS.getCode(), message, data);
    }

    public static RequestResult<?> failed() {
        return new RequestResult<>(ResultEnum.COMMON_FAILED.getCode(), ResultEnum.COMMON_FAILED.getMessage(), null);
    }

    public static RequestResult<?> failed(String message) {
        return new RequestResult<>(ResultEnum.COMMON_FAILED.getCode(), message, null);
    }

    public static RequestResult<?> failed(IResult errorRequestResult){
        return new RequestResult<>(errorRequestResult.getCode(), errorRequestResult.getMessage(), null);
    }

    public static <T> RequestResult<T> instance(Integer code, String message, T data) {
        RequestResult<T> RequestResult = new RequestResult<>();
        RequestResult.setCode(code);
        RequestResult.setMessage(message);
        RequestResult.setData(data);
        return RequestResult;
    }
}
