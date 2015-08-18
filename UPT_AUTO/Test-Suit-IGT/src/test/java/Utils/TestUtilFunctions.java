package Utils;

//import jdk.nashorn.internal.runtime.regexp.RegExp;
//import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

//import org.apache.http.HttpEntity;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.util.EntityUtils;

import com.jd.leo.IGT_Auto.Leo_Controller_Test.TestParams.ControllerParams;



/**
 * Created by changxuliang on 2015/8/6.
 */
public class TestUtilFunctions {

    /**
     * -> Login the Leo and get the cookies
     */

    public String LoginLeoAndReturnCookies() throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpClientContext postContext = HttpClientContext.create();

        HttpPost postERPverification  = new HttpPost(ControllerParams.URL_MktJdComLogin);

        LoginLeoPostHeaderSetter(postERPverification);

        List<BasicNameValuePair> postFormData = new ArrayList<BasicNameValuePair>();
        postFormData.add(new BasicNameValuePair("Name", ControllerParams.userName_MktJdComLogin));
        postFormData.add(new BasicNameValuePair("Password", ControllerParams.password_MktJdComLogin));
        postFormData.add(new BasicNameValuePair("__VIEWSTATE", "/wEPDwULLTE2NzYwNTA1MTVkZEiL3Hsi0sFHuXWon6f1ReMAAAAA"));
        postFormData.add(new BasicNameValuePair("__EVENTVALIDATION", "/wEWBALY9u3DDQKbufQdAtLF4JEPAu/P+d0FBqTrzufxlzac1YKA8fi4JwAAAAA="));
        postFormData.add(new BasicNameValuePair("Logon", "登  录"));

        postERPverification.setEntity(new UrlEncodedFormEntity(postFormData));

        httpClient.execute(postERPverification, postContext);

        /*若需要做多次post转跳，则可使用下面获取response body后通过正则表达式解析出含有 token 的跳转链接
        CloseableHttpResponse firstPostResponse = httpClient.execute(postERPverification, postContext);
        HttpEntity firstPostEntity = firstPostResponse.getEntity();

        Map<String, String> firstResponseBodyMap = new HashMap<String, String>();

        //获取第一次Post返回的response body的 href 标签值，使用正则表达式解析出第二次跳转的URL
        String firstPostResponseBody = EntityUtils.toString(firstPostEntity);
        Pattern pattern =  Pattern.compile(ControllerParams.regFirstLogin);
        Matcher matcher = pattern.matcher(firstPostResponseBody);

        if (matcher.find()){
            String str = matcher.group(1);
            System.out.println("first round post response body -> " + str);
            firstResponseBodyMap.put("secondPostUrl", str);
        }


        // 获取第一次Post登录ERP验证后的 cookie
        CookieStore cookieStore = postContext.getCookieStore();
        List<Cookie> list = cookieStore.getCookies();
        for (Cookie cookie:list){
            System.out.println(cookie.getValue());
        }
        */

        HttpGet getRelocation = new HttpGet(ControllerParams.URL_MktJdComIndex);

        LoginLeoGetHeaderSetter(getRelocation);

        CloseableHttpResponse secondGetResponse = httpClient.execute(getRelocation, postContext);

        /*若需要获取登录进ERP后的response body, 可使用以下代码
        HttpEntity secondGetEntity = secondGetResponse.getEntity();
        String secondGetResponseBody = EntityUtils.toString(secondGetEntity);
        System.out.println("After login the mkt.jd.com/index, the response body is ----------> \n\n " + secondGetResponseBody );
        */

        //获取成功登录mkt.jd.com/index后的cookie并将其返回
        Map<String, String> loginCookieMap = new HashMap<String, String>();
        CookieStore loginCookieStore = postContext.getCookieStore();
        List<Cookie> loginCookieList = loginCookieStore.getCookies();

        for (Cookie loginCookie:loginCookieList){
           if (loginCookie.getName().equals("erp1.jd.com")){
               loginCookieMap.put("erp1.jd.com", loginCookie.getValue());
           }
           else if (loginCookie.getName().equals("_leo_")){
               loginCookieMap.put("_leo_", loginCookie.getValue());
           }
           else {
                System.out.println("***********************Already login the ERP, Cookies are returned **************************");
           }

        }

        String loginCookiesReturn = "erp1.jd.com=" +  loginCookieMap.get("erp1.jd.com") + "; " + "_leo_=" + loginCookieMap.get("_leo_");

        return loginCookiesReturn;


    }



    public void LoginLeoPostHeaderSetter(HttpPost post) throws IOException {

        post.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        post.addHeader("Accept-Encoding", "gzip, deflate");
        post.addHeader("Accept-Language", "zh-CN,zh;q=0.8");
        post.addHeader("Cache-Control", "no-cache");
        post.addHeader("Connection", "keep-alive");
        post.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        post.addHeader("Host", "erp1.jd.com");
        post.addHeader("Origin", "http://erp1.jd.com");
        post.addHeader("Referer", "http://erp1.jd.com/newHrm/Verify.aspx?ReturnUrl=http%3A%2F%2Fmkt.jd.com%2Findex");
        post.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36");

    }


    public void LoginLeoGetHeaderSetter(HttpGet get) throws IOException {

        get.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        get.addHeader("Accept-Encoding", "gzip, deflate");
        get.addHeader("Accept-Language", "zh-CN,zh;q=0.8");
        get.addHeader("Cache-Control", "no-cache");
        get.addHeader("Connection", "keep-alive");
        get.addHeader("Pragma", "no-cache");
        get.addHeader("Host", "mkt.jd.com");
        get.addHeader("Referer", "http://erp1.jd.com/newHrm/Verify.aspx?ReturnUrl=http%3A%2F%2Fmkt.jd.com%2Findex");
        get.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36");

    }



    public void CrowdAllSecondCatePostHeaderSetter(HttpPost post) throws IOException {

        post.addHeader("Accept", "application/json, text/javascript, */*; q=0.01");
        post.addHeader("Accept-Encoding", "gzip, deflate");
        post.addHeader("Accept-Language", "zh-CN,zh;q=0.8");
        post.addHeader("Cache-Control", "no-cache");
        post.addHeader("Connection", "keep-alive");
        post.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        post.addHeader("Host", "mkt.jd.com");
        post.addHeader("isAjax", "true");
        post.addHeader("Origin", "http://mkt.jd.com");
        post.addHeader("Referer", "http://mkt.jd.com/index");
        post.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36");
        post.addHeader("X-Requested-With", "XMLHttpRequest");

    }





}





