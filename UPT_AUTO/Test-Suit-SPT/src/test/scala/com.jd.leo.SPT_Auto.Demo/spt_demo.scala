package com.jd.leo.SPT_Auto.Demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._



/**
 * Created by changxuliang on 2015/8/28.
 */


class spt_demo extends Simulation {

    val httpProtocol = http
      .baseURL("https://www.baidu.com")
      .inferHtmlResources()

    val headers_0 = Map(
      "X-Requested-With" -> "XMLHttpRequest",
      "is_params" -> "imes=0.1.4753.0.1.1",
      "is_referer" -> "https://www.baidu.com/",
      "is_xhr" -> "1")

    val headers_1 = Map("Accept" -> "application/javascript, */*;q=0.8")

    val headers_3 = Map("Accept" -> "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5")

    val headers_7 = Map(
      "X-Requested-With" -> "XMLHttpRequest",
      "is_params" -> "imes=0.1.4032.0.1.128.0.1.96.0.1.32",
      "is_pbs" -> "%E4%BA%AC%E4%B8%9C",
      "is_referer" -> "https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=%E4%BA%AC%E4%B8%9C&rsv_pq=db8265470002cd31&rsv_t=57149uHmWTqwYxO04kMzuvKosuEI1UvioWCVqr9LtBKxGUBnDPLTfexfxtE&rsv_enter=1&rsv_sug3=3",
      "is_xhr" -> "1")

    val headers_8 = Map(
      "X-Requested-With" -> "XMLHttpRequest",
      "is_pbs" -> "%E4%BA%AC%E4%B8%9C",
      "is_referer" -> "https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=%E4%BA%AC%E4%B8%9C&rsv_pq=db8265470002cd31&rsv_t=57149uHmWTqwYxO04kMzuvKosuEI1UvioWCVqr9LtBKxGUBnDPLTfexfxtE&rsv_enter=1&rsv_sug3=3",
      "is_xhr" -> "1")

    val headers_9 = Map(
      "X-Requested-With" -> "XMLHttpRequest",
      "is_referer" -> "https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=%E4%BA%AC%E4%B8%9C&rsv_pq=db8265470002cd31&rsv_t=57149uHmWTqwYxO04kMzuvKosuEI1UvioWCVqr9LtBKxGUBnDPLTfexfxtE&rsv_enter=1&rsv_sug3=3",
      "is_xhr" -> "1")

    val uri1 = "https://www.baidu.com:443"

    val scn = scenario("RecordedSimulation")
      .exec(http("request_0")
      .get("/s?ie=utf-8&mod=11&isbd=1&isid=D10BDEE2F9B64103&ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=JD&rsv_pq=db8265470002cd31&rsv_t=57149uHmWTqwYxO04kMzuvKosuEI1UvioWCVqr9LtBKxGUBnDPLTfexfxtE&rsv_enter=1&rsv_sug3=3&rsv_sid=1462_16839_16738_13245_12824_14432_17012_12868_16938_16800_17000_16935_17004_12835_17072_15454_12244_13932_16968_16867&_ss=1&clist=&hsug=&csor=2&pstg=5&_cr1=27932")
      .headers(headers_0)
      .resources(http("request_1")
      .get(uri1 + "/cache/aladdin/ui/dropdown21/dropdown21.js?v=20140227")
      .headers(headers_1),
        http("request_2")
          .get(uri1 + "/cache/aladdin/ui/tabs5/tabs5.js?v=20150429")
          .headers(headers_1),
        http("request_3")
          .get(uri1 + "/aladdin/img/stockdynamic/arrow.png")
          .headers(headers_3),
        http("request_4")
          .get(uri1 + "/aladdin/img/offical_weibo/weibo_level_icon.png")
          .headers(headers_3),
        http("request_5")
          .get(uri1 + "/aladdin/img/tools/tools-5.png")
          .headers(headers_3),
        http("request_6")
          .get(uri1 + "/cache/global/img/aladdinIcon-1.0.gif")
          .headers(headers_3),
        http("request_7")
          .get(uri1 + "/s?ie=utf-8&mod=11&isbd=1&isid=D10BDEE2F9B64103&ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=JD.COM&rsv_pq=db8265470002cd31&rsv_t=bb1c7hzXhLBcuIYljOea1C9LwrHZKLScUE6T%2Bj5%2BLcv3DwEV2oKy7dKwyE0&rsv_enter=1&rsv_sug3=7&rsv_sid=1462_16839_16738_13245_12824_14432_17012_12868_16938_16800_17000_16935_17004_12835_17072_15454_12244_13932_16968_16867&_ss=1&clist=9815684a6cdcdee8&hsug=&csor=6&pstg=5&_cr1=29314")
          .headers(headers_7),
        http("request_8")
          .get(uri1 + "/s?ie=utf-8&mod=1&isbd=1&isid=D10BDEE2F9B64103&ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=JD.COM&rsv_pq=db8265470002cd31&rsv_t=bb1c7hzXhLBcuIYljOea1C9LwrHZKLScUE6T%2Bj5%2BLcv3DwEV2oKy7dKwyE0&rsv_enter=1&rsv_sug3=8&rsv_sug2=0&inputT=9636&rsv_sug4=15910&rsv_sid=1462_16839_16738_13245_12824_14432_17012_12868_16938_16800_17000_16935_17004_12835_17072_15454_12244_13932_16968_16867&_ss=1&clist=9815684a6cdcdee8&hsug=&f4s=1&csor=6&_cr1=32202")
          .headers(headers_8),
        http("request_9")
          .get(uri1 + "/s?ie=utf-8&csq=1&pstg=20&mod=2&isbd=1&cqid=f7d955f1000051de&istc=575&ver=Qt9bJQYG0OLaje7bpqOIm39X10B9WC7MCY3&chk=55e002b0&isid=D10BDEE2F9B64103&ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=JD.COM&rsv_pq=db8265470002cd31&rsv_t=bb1c7hzXhLBcuIYljOea1C9LwrHZKLScUE6T%2Bj5%2BLcv3DwEV2oKy7dKwyE0&rsv_enter=1&rsv_sug3=8&rsv_sug2=0&inputT=9636&rsv_sug4=15910&f4s=1&_ck=1159.0.-1.-1.-1.-1.-1&rsv_isid=1462_16839_16738_13245_12824_14432_17012_12868_16938_16800_17000_16935_17004_12835_17072_15454_12244_13932_16968_16867&rsv_stat=-2&rsv_bp=1")
          .headers(headers_9)))

    setUp(scn.inject(atOnceUsers(100))).protocols(httpProtocol)
  }


