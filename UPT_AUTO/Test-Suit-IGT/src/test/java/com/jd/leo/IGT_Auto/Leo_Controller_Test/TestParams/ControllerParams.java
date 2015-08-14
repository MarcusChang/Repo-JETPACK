package com.jd.leo.IGT_Auto.Leo_Controller_Test.TestParams;

/**
 * Created by changxuliang on 2015/7/30.
 * This java file is used to store all const params for all leo-controller test cases
 */
public class ControllerParams {

    //the url for the user login the admin system
    public static final String URL_AdmninLogin = "http://mkt.jd.com/admin/login.html";

    //the url for the second category of platform filter
    public static final String URL_CrowdAllSecondCate = "http://mkt.jd.com/crowd/all/secondCate";

    //the url for the user login the mkt.jd.com
    public static final String URL_MktJdComLogin = "http://erp1.jd.com/newHrm/Verify.aspx?ReturnUrl=http%3a%2f%2fmkt.jd.com%2findex";
    
    public static final String URL_MktJdComIndex = "http://mkt.jd.com/index";

    //the userName for mkt.jd.com login
    public static final String userName_MktJdComLogin = "changxuliang";

    //the password for mkt.jd.com login
    public static final String password_MktJdComLogin = "#EDCvfr5%TGBnhy6";

    //the regular expression for obtain the returned body's jump url
    public static final String regFirstLogin = "href=\\\"(.*)\\\"";




}
