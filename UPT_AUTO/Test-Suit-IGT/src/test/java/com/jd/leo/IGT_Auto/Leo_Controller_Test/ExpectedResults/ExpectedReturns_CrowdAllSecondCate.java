package com.jd.leo.IGT_Auto.Leo_Controller_Test.ExpectedResults;

import java.io.IOException;
import junit.framework.Assert;



/**
 * Created by changxuliang on 2015/8/14.
 */
public class ExpectedReturns_CrowdAllSecondCate {

    public void expectedReturns(String response) throws IOException {

        //the TestCase_CrowdAllSecondCate returned http response JSON contents
        String ExpectedJSON_CrowdAllSecondCate = "{\"message\":\"查询二级商品分类成功\",\"result\":{\"secondCateList\":[{\"cateId\":1713,\"cateName\":\"图书\",\"children\":[{\"cateId\":3258,\"cateName\":\"小说\"},{\"cateId\":3259,\"cateName\":\"文学\"},{\"cateId\":3260,\"cateName\":\"青春文学\"},{\"cateId\":3261,\"cateName\":\"传记\"},{\"cateId\":3262,\"cateName\":\"艺术\"},{\"cateId\":3263,\"cateName\":\"少儿\"},{\"cateId\":3264,\"cateName\":\"经济\"},{\"cateId\":3265,\"cateName\":\"金融与投资\"},{\"cateId\":3266,\"cateName\":\"管理\"},{\"cateId\":3267,\"cateName\":\"励志与成功\"},{\"cateId\":3269,\"cateName\":\"健身与保健\"},{\"cateId\":3270,\"cateName\":\"家教与育儿\"},{\"cateId\":3271,\"cateName\":\"旅游/地图\"},{\"cateId\":3272,\"cateName\":\"动漫\"},{\"cateId\":3273,\"cateName\":\"历史\"},{\"cateId\":3274,\"cateName\":\"哲学/宗教\"},{\"cateId\":3275,\"cateName\":\"国学/古籍\"},{\"cateId\":3276,\"cateName\":\"政治/军事\"},{\"cateId\":3277,\"cateName\":\"法律\"},{\"cateId\":3279,\"cateName\":\"心理学\"},{\"cateId\":3280,\"cateName\":\"文化\"},{\"cateId\":3281,\"cateName\":\"社会科学\"},{\"cateId\":3282,\"cateName\":\"工业技术\"},{\"cateId\":3284,\"cateName\":\"建筑\"},{\"cateId\":3285,\"cateName\":\"医学\"},{\"cateId\":3286,\"cateName\":\"科学与自然\"},{\"cateId\":3287,\"cateName\":\"计算机与互联网\"},{\"cateId\":3288,\"cateName\":\"体育/运动\"},{\"cateId\":3289,\"cateName\":\"中小学教辅\"},{\"cateId\":3290,\"cateName\":\"考试\"},{\"cateId\":3291,\"cateName\":\"外语学习\"},{\"cateId\":3294,\"cateName\":\"字典词典/工具书\"},{\"cateId\":3296,\"cateName\":\"套装书\"},{\"cateId\":4002,\"cateName\":\"其它\"},{\"cateId\":4758,\"cateName\":\"杂志/期刊\"},{\"cateId\":4830,\"cateName\":\"赠品\"},{\"cateId\":4855,\"cateName\":\"英文原版书\"},{\"cateId\":6929,\"cateName\":\"港台图书\"},{\"cateId\":7176,\"cateName\":\"满200减100专区\"},{\"cateId\":9278,\"cateName\":\"烹饪/美食\"},{\"cateId\":9291,\"cateName\":\"时尚/美妆\"},{\"cateId\":9301,\"cateName\":\"家居\"},{\"cateId\":9309,\"cateName\":\"婚恋与两性\"},{\"cateId\":9314,\"cateName\":\"娱乐/休闲\"},{\"cateId\":9340,\"cateName\":\"科普读物\"},{\"cateId\":9351,\"cateName\":\"电子与通信\"},{\"cateId\":9368,\"cateName\":\"农业/林业\"},{\"cateId\":11047,\"cateName\":\"大中专教材教辅\"},{\"cateId\":11241,\"cateName\":\"小语种原版书\"},{\"cateId\":11242,\"cateName\":\"二手书\"},{\"cateId\":11243,\"cateName\":\"图书周边/文化产品\"},{\"cateId\":11745,\"cateName\":\"文化用品\"},{\"cateId\":12775,\"cateName\":\"绘画\"},{\"cateId\":12776,\"cateName\":\"摄影\"}]}]},\"success\":true}";

        //Checkpoint 1 => check the input response JSON whether equals to ExpectedJSON_CrowdAllSecondCate
        Assert.assertEquals(ExpectedJSON_CrowdAllSecondCate, response);

    }


}
