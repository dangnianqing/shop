package com.shop.search;

import com.github.pagehelper.util.StringUtil;
import com.shop.common.base.PageParam;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ：zhanghaijun
 * @Date ：Created in  2024/4/18 16:23
 * @Description：
 */
@Data
public class RoleSearch extends PageParam implements Serializable {

    private String name;

    public Map<String, Object> querymap() {
        return new HashMap<String, Object>() {{
            if (StringUtil.isNotEmpty(name)) {
                put("name", name);
            }
        }};
    }
}
