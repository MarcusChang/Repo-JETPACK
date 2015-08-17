package com.jd.leo.IGT_Auto.Leo_Controller_Test.ExpectedResults;

import java.io.IOException;

import junit.framework.Assert;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by changxuliang on 2015/8/14.
 */
public class ExpectedReturns_AdminIndexController {


    public void expectedReturns(String response) throws IOException {
        Document returnsDoc = Jsoup.parse(response);
        if (returnsDoc != null) {
            System.out.println("************************Jsoup Returns Doc***********************\n" + returnsDoc.toString() + "\n");
        }

        String returnsDocTitle = returnsDoc.title().trim();
        System.out.println("******************* returnsDocTitle ==> " + returnsDocTitle);

        //Checkpoint 1 => check the returnsDoc's title
        Assert.assertTrue((returnsDocTitle.equals("管理员登陆")));

        Elements returnsDocFormsLabels = returnsDoc.getElementsByAttributeValue("class", "forms_label");
        String returnsDocFormsLabelsLogin = returnsDocFormsLabels.eq(1).text();
        String returnsDocFormsLabelsPass = returnsDocFormsLabels.eq(2).text();
        System.out.println("******************* returnsDocFormsLabelsLogin ==> " + returnsDocFormsLabelsLogin);
        System.out.println("******************* returnsDocFormsLabelsPass ==> " + returnsDocFormsLabelsPass);

        //Checkpoint 2 => check the returnsDoc's body forms_label
        Assert.assertEquals("登陆账号*", returnsDocFormsLabelsLogin.trim());
        Assert.assertEquals("密码*", returnsDocFormsLabelsPass.trim());

        Element returnsDocPopupBtnAreaSubmit = returnsDoc.getElementById("btn_submit");
        Element returnsDocPopupBtnAreaCancel = returnsDoc.getElementById("btn_cancel");
        String returnsDocPopupBtnAreaSubmitBtn = returnsDocPopupBtnAreaSubmit.attr("value");
        String returnsDocPopupBtnAreaCancelBtn = returnsDocPopupBtnAreaCancel.attr("value");
        System.out.println("******************* returnsDocPopupBtnAreaSubmitBtn ==> " + returnsDocPopupBtnAreaSubmitBtn + "\n"
                + "******************* returnsDocPopupBtnAreaCancelBtn ==> " + returnsDocPopupBtnAreaCancelBtn);

        //Checkpoint 3 => check the returnsDoc's body popup_btnarea
        Assert.assertEquals("登陆", returnsDocPopupBtnAreaSubmitBtn.trim());
        Assert.assertEquals("取消", returnsDocPopupBtnAreaCancelBtn.trim());

    }



}
