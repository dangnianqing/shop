package com.shop.controller;

import com.shop.common.result.RequestResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/15 15:32
 * @Description：
 */
@RequestMapping("/userLogin")
@RestController
public class UserLoginController {


    @PostMapping("/login")
    public RequestResult<String> login(@Param("userName") String userName, @Param("password") String password) {
        System.out.println("userName = " + userName);
        System.out.println("password = " + password);
        return RequestResult.success("eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJhZG1pbiIsImlhdCI6MTcxMzE2NjQ1NSwic3ViIjoiIiwiaXNzIjoiRFUiLCJleHAiOjE3MTMxNjY1NDV9.RUDVkPnyMajdchd5rYkhNHlMFrLY15dfVPJNb6OLe1_Z48YR1HgWrxrjZuwXo8m_ULrg-QkpJLsyJEDrV2bl5w");
    }

    @PostMapping("/info")
    public RequestResult<Boolean> info(@Param("token") String token) {
        System.out.println("token = " + token);
        return RequestResult.success(true);
    }
}
