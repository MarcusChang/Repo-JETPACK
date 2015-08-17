package com.jd.leo.IGT_Auto.Leo_Controller_Test.Admin_Cases;

import com.jd.leo.IGT_Auto.Leo_Controller_Test.ExpectedResults.ExpectedReturns_AdminIndexController;
import com.jd.leo.IGT_Auto.Leo_Controller_Test.TestParams.ControllerParams;

import org.apache.commons.compress.utils.IOUtils;
import org.junit.Test;

import java.io.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.DefaultHttpClient;
//import com.alibaba.fastjson.JSONObject;



/**
 * Created by changxuliang on 2015/7/30.
 */
public class TestCase_AdminIndexController {


    @Test
    public void 超管后台_登录_AdminLogin() throws IOException {

        HttpClient client = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(ControllerParams.URL_AdmninLogin);
        HttpResponse response = client.execute(httpGet);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            InputStream instream = entity.getContent();
            String responseBody = new String(IOUtils.toByteArray(instream), "utf-8");
            System.out.println(responseBody);

            //Call the expected output methods to compare the actual response body with the expected response body checkpoints
            ExpectedReturns_AdminIndexController expRetruns = new ExpectedReturns_AdminIndexController();
            expRetruns.expectedReturns(responseBody);

            httpGet.abort();
        }

    }

}