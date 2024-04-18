package com.shop.search;

import com.github.pagehelper.util.StringUtil;
import com.shop.common.base.PageParam;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/18 10:37
 * @Description：
 */
@Data
public class UserSearch extends PageParam implements Serializable {
    private String userName;
    private String mobile;
    private Integer status;

    public Map<String, Object> querymap() {
        return new HashMap<String, Object>() {{
            if (StringUtil.isNotEmpty(userName)) {
                put("userName", userName);
            }
            if (StringUtil.isNotEmpty(mobile)) {
                put("mobile", mobile);
            }
            if (status != null) {
                put("status", status);
            }
        }};
    }
}
