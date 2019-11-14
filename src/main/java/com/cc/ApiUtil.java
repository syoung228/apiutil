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
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.List;

/**
 * @ClassName
 * @author songy
 * @Date
 * @Version 1.0
 */

public class ApiUtil {
    public static Data getAds(){
        String result = "";
        try {
            result = HttpClientUtil.httpGet(WeApiConstats.ADS);
        }catch (Exception e){
            Data data = new Data();
            data.setCode("500");
            data.setStatus("系统错误");
            return data;
        }
        JSONObject jsonObject  = JSONObject.parseObject(result);
        Data Data = JSONObject.toJavaObject(jsonObject,Data.class);
        return Data;
    }
}
