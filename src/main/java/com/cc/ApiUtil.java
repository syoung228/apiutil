package com.cc;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 9:35
 */

import com.WeApiConstats;
import com.alibaba.fastjson.JSONObject;
import com.pojo.Ads;
import com.pojo.Data;
import com.util.ApiException;
import com.util.HttpClientUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName
 * @author songy
 * @Date
 * @Version 1.0
 */

public class ApiUtil {
    /**
     * 获取物料列表
     * @param per_page 每条页数
     * @param page 当前页
     * @return
     */
    public static Data getAds(String per_page,String page) throws ApiException{
        Data data = null;
        if(page == null){
            page = "1";
        }
        String url = WeApiConstats.ADS+"?page="+page;
        if(per_page != null){
            url = url + "&per_page=" +per_page;
        }
        String result = HttpClientUtil.httpGet(url);
        JSONObject jsonObject  = JSONObject.parseObject(result);
        if(!jsonObject.get("code").toString().startsWith("2")){
            JSONObject jsonObject2  = JSONObject.parseObject(jsonObject.get("error").toString());
            throw new ApiException(jsonObject2.get("message").toString());
        }
        data = JSONObject.toJavaObject(jsonObject,Data.class);
        return data;
    }

    /**
     * 物料商品详情
     * @param adsId 物料商品id
     * @return
     */
    public static Data getAdsInfo(String adsId) throws ApiException {
        Data data = new Data();
        String url = WeApiConstats.ADS_INFO+adsId;
        String result = HttpClientUtil.httpGet(url);
        JSONObject jsonObject  = JSONObject.parseObject(result);
        if(!jsonObject.get("code").toString().startsWith("2")){
            JSONObject jsonObject2  = JSONObject.parseObject(jsonObject.get("error").toString());
            throw new ApiException(jsonObject2.get("message").toString());
        }
        data = JSONObject.toJavaObject(jsonObject,Data.class);
        return data;

    }

    /**
     * 短信推广
     * @param api_key 客户认证
     * @param phone 电话号码
     * @param adsId 物料id
     * @return 短信id
     */
    public static String sms(String api_key,String phone,String adsId) throws ApiException{
        String smsId = null;
        Map<String, Object> map = new HashMap<>();
        map.put("phone", phone);
        map.put("ads", adsId);
        String result = HttpClientUtil.httpsPost(map, WeApiConstats.SMS, "Bearer " + api_key);
        JSONObject jsonObject = JSONObject.parseObject(result);
        if (!jsonObject.get("code").toString().startsWith("2")) {
            JSONObject jsonObject2 = JSONObject.parseObject(jsonObject.get("error").toString());
            throw new ApiException(jsonObject2.get("message").toString());
        }
        JSONObject returnData = JSONObject.parseObject(jsonObject.get("data").toString());
        smsId = returnData.get("id").toString();
        return smsId;
    }
}
