package com.jd.leo.IGT_Auto.Leo_Controller_Test.Crowd_Cases;

import Utils.TestUtilFunctions;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jd.leo.IGT_Auto.Leo_Controller_Test.ExpectedResults.ExpectedReturns_CrowdAllSecondCate;
import com.jd.leo.IGT_Auto.Leo_Controller_Test.TestParams.ControllerParams;
//import com.jd.leo.bigdata.domain.CategoryResult;
//import com.jd.leo.domain.Result;

import org.apache.commons.compress.utils.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import org.junit.Test;

import java.io.*;
import java.util.*;



/**
 * Created by changxuliang on 2015/7/31.
 */
public class TestCase_CrowdAllSecondCate {

    @Test
    public void 人群管理_平台筛选_商品一级品类_图书_CrowdAllSecondCate() throws IOException {


        HttpClient client = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(ControllerParams.URL_CrowdAllSecondCate);
        TestUtilFunctions testUtil = new TestUtilFunctions();

        testUtil.CrowdAllSecondCatePostHeaderSetter(httpPost);
        httpPost.addHeader("Cookie", testUtil.LoginLeoAndReturnCookies());

        Map<String, String> params = new HashMap<String, String>();
        params.put("firstCate", "1713");

        List<NameValuePair> postEntityFormList = new ArrayList<NameValuePair>();

        Set<String> keySet = params.keySet();
        for(String key : keySet) {
            postEntityFormList.add(new BasicNameValuePair(key, params.get(key)));
        }

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(postEntityFormList, HTTP.UTF_8));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        HttpResponse response = client.execute(httpPost);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            InputStream instream = entity.getContent();
            String responseBody = new String(IOUtils.toByteArray(instream), "utf-8");
            System.out.println(responseBody);

            JSONObject responseBodyJson = JSON.parseObject(responseBody);
            String responseBodyJsonStr = responseBodyJson.toString();

            //Call the expected output methods to compare the actual response body with the expected response body checkpoints
            ExpectedReturns_CrowdAllSecondCate expRetruns = new ExpectedReturns_CrowdAllSecondCate();
            expRetruns.expectedReturns(responseBodyJsonStr);



/*            //if need to parse the returned response JSON to leo.Result type, can use below codes
            Result result = JSON.parseObject(responseBody, Result.class);
            System.out.println(result.getResult());

            System.out.println("-----------------------以下为解析后的JSON----------------------");
            List<CategoryResult> firstCateList = JSON.parseArray(String.valueOf(result.getResult().get("secondCateList")), CategoryResult.class);
            for (CategoryResult firstCate : firstCateList) {
                System.out.println(firstCate.getCateId() + "  " + firstCate.getCateName());

                Set<CategoryResult> secondCateList = firstCate.getChildren();
                for (CategoryResult secondCate : secondCateList) {
                    System.out.println(secondCate.getCateId() + "  " + secondCate.getCateName());
                }

            }*/

        }


    }

}
