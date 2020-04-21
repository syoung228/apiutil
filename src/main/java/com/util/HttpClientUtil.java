
package com.util;

import org.apache.commons.lang.StringUtils;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.URLDecoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * httpclient工具类
 *
 * @ClassName: HttpClientUtil
 * @Description:
 */
public class HttpClientUtil {

    private static final String token_key = "Authorization";
    private static CloseableHttpClient httpClient;
    private static CloseableHttpResponse httpResponse;


    private static PoolingHttpClientConnectionManager cm;

    static {
        init();
    }

    private static void init() {
        if (cm == null) {
            cm = new PoolingHttpClientConnectionManager();
            // 整个连接池最大连接数
            cm.setMaxTotal(50);
            // 每路由最大连接数，默认值是2
            cm.setDefaultMaxPerRoute(5);
        }
    }

    public static CloseableHttpClient createSSLClientDefault() {
        try {
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                // 信任所有
                @Override
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            }).build();
            HostnameVerifier hostnameVerifier = NoopHostnameVerifier.INSTANCE;
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, hostnameVerifier);
            return HttpClients.custom().setSSLSocketFactory(sslsf).build();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
        return HttpClients.createDefault();

    }

    /**
     * 通过连接池获取httpclient
     *
     * @param
     * @return CloseableHttpClient
     * 返回类型 @throws
     * @Title: getHttpClient
     * @Description:TODO(这里用一句话描述这个方法的作用)
     */
    private static CloseableHttpClient getHttpClient() {
        return HttpClients.custom().setConnectionManager(cm).build();
    }


    public static String httpPost(String url, Object jsonParam, String token) {

        return httpPost(url, jsonParam, false, token);
    }


    public static String httpPost(
            String url, Object jsonParam, boolean noNeedResponse, String token) {
        String strResult = "";
        try {
            CloseableHttpClient httpClient = createSSLClientDefault();
            HttpPost method = new HttpPost(url);
            method.setHeader("Accept", "application/json");
            if (StringUtils.isNotEmpty(token)) {
                method.setHeader(token_key, token);
            }
            if (null != jsonParam) {
                // 解决中文乱码问题
                StringEntity entity =
                        new StringEntity(jsonParam.toString(), "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/json");
                method.setEntity(entity);
            }
            CloseableHttpResponse result = httpClient.execute(method);
            url = URLDecoder.decode(url, "UTF-8");
            /** 请求发送成功，并得到响应 **/
            if (result.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                try {
                    /** 读取服务器返回过来的json字符串数据 **/
                    strResult = EntityUtils.toString(result.getEntity());
                    if (noNeedResponse) {
                        return null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    // logger.error("post请求提交失败:" + url, e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // logger.error("post请求提交失败:" + url, e);
        }
        return strResult;
    }

    public static String httpGet(String url) {
        return httpGet(url, null);
    }

    public static String httpGet(String url, String token) {

        // get请求返回结果
        String strResult = "";
        try {
            CloseableHttpClient httpClient = getHttpClient();
            // 发送get请求
            HttpGet request = new HttpGet(url);
            if (StringUtils.isNotEmpty(token)) {
                request.setHeader(token_key, token);
            }
            HttpResponse response = httpClient.execute(request);

            /** 请求发送成功，并得到响应 **/
            //if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                /** 读取服务器返回过来的json字符串数据 **/
                strResult = EntityUtils.toString(response.getEntity());
            //} else {
                // logger.error("get请求提交失败:" + url);
            //}
        } catch (IOException e) {
            e.printStackTrace();
            // logger.error("get请求提交失败:" + url, e);
        }
        return strResult;
    }


    public static String httpsPost(Map<String, Object> params, String url,String token) {
        try {
            HttpPost method = new HttpPost(url);
            method.setHeader("Accept", "application/json");
            if (StringUtils.isNotEmpty(token)) {
                method.setHeader(token_key, token);
            }
            List<NameValuePair> listNVP = new ArrayList<NameValuePair>();
            if (params != null) {
                for (String key : params.keySet()) {
                    listNVP.add(new BasicNameValuePair(key, params.get(key).toString()));
                }
            }
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(listNVP, "UTF-8");
            method.setEntity(entity);
            httpClient = HttpClientUtil.createSSLClientDefault();
            httpResponse = httpClient.execute(method);
            HttpEntity httpEntity = httpResponse.getEntity();
            if (httpEntity != null) {
                String jsObject = EntityUtils.toString(httpEntity, "UTF-8");
                return jsObject;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                System.out.println("sd");
                httpResponse.close();
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
