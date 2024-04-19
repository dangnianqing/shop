package com.shop.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/19 08:46
 * @Description：
 */
@Data
public class LoginFrom implements Serializable {
    private String username;
    private String password;
}
