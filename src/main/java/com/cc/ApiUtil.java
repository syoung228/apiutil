package com.cc;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 9:35
 */

import com.WeApiConstats;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pojo.Ads;
import com.pojo.Data;
import com.util.HttpClientUtil;

import java.util.List;

/**
 * @ClassName
 * @author songy
 * @Date
 * @Version 1.0
 */

public class ApiUtil {
    public static Data getAds(){
        String result = HttpClientUtil.httpGet(WeApiConstats.ADS);
        JSONObject jsonObject  = JSONObject.parseObject(result);
        Data Data = JSONObject.toJavaObject(jsonObject,Data.class);
        return Data;
    }
}
