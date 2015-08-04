package com.jd.leo.IGT_Auto.Leo_Controller_Test.Crowd_Cases;

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

        httpPost.addHeader("Accept", "application/json, text/javascript, */*; q=0.01");
        httpPost.addHeader("Accept-Encoding", "gzip, deflate");
        httpPost.addHeader("Accept-Language", "zh-CN,zh;q=0.8");
        httpPost.addHeader("Cache-Control", "no-cache");
        httpPost.addHeader("Connection", "keep-alive");
        //httpPost.addHeader("Content-Length", "14");
        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        httpPost.addHeader("Host", "mkt.jd.com");
        httpPost.addHeader("isAjax", "true");
        httpPost.addHeader("Origin", "http://mkt.jd.com");
        httpPost.addHeader("Referer", "http://mkt.jd.com/index");
        httpPost.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36");
        httpPost.addHeader("X-Requested-With", "XMLHttpRequest");
        httpPost.addHeader("Cookie", "user-key=f4e224b3-c1fc-4a56-9ac0-a2811440ac97; _tp=PsaU8Dy5e0VlxQfvyk7hVQ%3D%3D; _pst=luoyi12345; TrackID=1cQkhcu97SPgG3J2ZGNvRUdj2K6u1knc6zsBSd3Y8_mogVlKHeAlhtSS9ek6cTrfsuR6GP7FNadhjGnVCrXo8HHKRltMPFAOT1m6xw04fp7Q; pinId=yoaEiePJ8W1JsaR1zbM-8w; unick=luoyi12345; cn=0; ipLocation=%u56DB%u5DDD; areaId=22; ipLoc-djd=22-1930-4284-0; __jda=122270672.1910363473.1436940735.1438053245.1438070879.13; __jdv=122270672|leo.jd.net|-|referral|-; SignOnDefault=changxuliang; __jdu=1910363473; erp1.jd.com=C54252455295E677CDD2DE80B59E60BD74F23C0504CB14935F584EF46E0C0889110121027B10249B1818A442B9C6E0019BD81F865D7E55AAFB139651A317EBE36379E1A27249C450F88D82C23E5ADED0; _leo_=E6NQZB6QZSAPYISZG4DSHVFMPSNYDHK2V7JRYTOBZGSZIROZFKCA7WPY4TRHA2FLOOI6EHFG6SDMLTH3MALMUUWBXBII2QCNFPYMGWUQJQJZD3YXBEGA");

        Map<String, String> params = new HashMap<String, String>();
        params.put("firstCate", "1713");

        List<NameValuePair> nvps = new ArrayList<NameValuePair>();

        Set<String> keySet = params.keySet();
        for(String key : keySet) {
            nvps.add(new BasicNameValuePair(key, params.get(key)));
        }

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
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

            System.out.println("-----------");
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
