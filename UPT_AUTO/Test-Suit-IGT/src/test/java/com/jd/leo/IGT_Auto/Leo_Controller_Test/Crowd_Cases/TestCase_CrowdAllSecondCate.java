package com.jd.leo.IGT_Auto.Leo_Controller_Test.Crowd_Cases;

import Utils.TestUtilFunctions;
import com.alibaba.fastjson.JSON;
import com.jd.leo.IGT_Auto.Leo_Controller_Test.TestParams.ControllerParams;
import com.jd.leo.bigdata.domain.CategoryResult;

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

import com.jd.leo.domain.Result;


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

            Result result = JSON.parseObject(responseBody, Result.class);
            System.out.println(result.getResult());

            System.out.println("-----------------------以下为解析后的JSON----------------------");
            List<CategoryResult> secondCateList = JSON.parseArray(String.valueOf(result.getResult().get("secondCateList")), CategoryResult.class);
            for (CategoryResult secondCate : secondCateList) {
                System.out.println(secondCate.getCateId() + "  " + secondCate.getCateName());

                Set<CategoryResult> thirdcateList = secondCate.getChildren();
                for (CategoryResult thirdCate : thirdcateList) {
                    System.out.println(thirdCate.getCateId() + "  " + thirdCate.getCateName());
                }

            }

        }


    }

}
