package com.cc;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 9:35
 */

import com.WeApiConstats;
import com.alibaba.fastjson.JSONObject;
import com.pojo.Data;
import com.util.ApiException;
import com.util.HttpUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author songy
 * @ClassName
 * @Date
 * @Version 1.0
 */

public class ApiUtil {
    /**
     * 获取物料列表
     *
     * @param per_page 每条页数
     * @param page     当前页
     * @return
     * @throws ApiException
     */
    public static Data getAds(String per_page, String page) throws ApiException {
        String code = "2";
        String codeValue = "code";
        if (page == null) {
            page = "1";
        }
        String url = WeApiConstats.ADS + "?page=" + page;
        if (per_page != null) {
            url = url + "&per_page=" + per_page;
        }
        String result = null;
        try {
            result = HttpUtils.get(HttpUtils.doGet(url,null,null,null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.parseObject(result);
        if (!jsonObject.get(codeValue).toString().startsWith(code)) {
            JSONObject jsonObject2 = JSONObject.parseObject(jsonObject.get("error").toString());
            throw new ApiException(jsonObject2.get("message").toString());
        }
        Data data = JSONObject.toJavaObject(jsonObject, Data.class);
        return data;
    }

    /**
     * 物料商品详情
     *
     * @param adsId 物料商品id
     * @return
     * @throws ApiException
     */
    public static Data getAdsInfo(String adsId) throws ApiException {
        String code = "2";
        String codeValue = "code";
        String url = WeApiConstats.ADS_INFO + adsId;
        String result = null;
        try {
            result = HttpUtils.get(HttpUtils.doGet(url,null,null,null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.parseObject(result);
        if (!jsonObject.get(codeValue).toString().startsWith(code)) {
            JSONObject jsonObject2 = JSONObject.parseObject(jsonObject.get("error").toString());
            throw new ApiException(jsonObject2.get("message").toString());
        }
        Data data = JSONObject.toJavaObject(jsonObject, Data.class);
        return data;

    }

    /**
     * 短信推广
     *
     * @param api_key 客户认证
     * @param phone   电话号码
     * @param adsId   物料id
     * @return 短信id
     * @throws ApiException
     */
    public static String sms(String api_key, String phone, String adsId) throws ApiException {
        String code = "2";
        String codeValue = "code";
        Map<String, String> body = new HashMap<>(4);
        Map<String, String> header = new HashMap<>(4);
        header.put("Accept","application/json");
        header.put("Authorization",api_key);
        body.put("phone", phone);
        body.put("ads", adsId);
        String result = null;
        try {
            result = HttpUtils.get(HttpUtils.doPost(WeApiConstats.SMS,null,header,null,body));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.parseObject(result);
        if (!jsonObject.get(codeValue).toString().startsWith(code)) {
            JSONObject jsonObject2 = JSONObject.parseObject(jsonObject.get("error").toString());
            throw new ApiException(jsonObject2.get("message").toString());
        }
        JSONObject returnData = JSONObject.parseObject(jsonObject.get("data").toString());
        String smsId = returnData.get("id").toString();
        return smsId;
    }
}
