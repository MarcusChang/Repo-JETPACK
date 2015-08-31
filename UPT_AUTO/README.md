UPT_AUTO
========
UPT_AUTO 源码，用于覆盖 API/服务/接口/业务层及服务器端性能工具的整合测试框架。
纯JAVA技术栈（服务器端性能测试使用的脚本为scala，但依然使用Jenkins集成），JUNIT / Log4j / WebDriver / Surefire / Maven / HttpClient/ org.apache.commons / org.apache.httpcomponents / com.alibaba.fastjson / commons-httpclient / org.jsoup / Gatling。
========

Test-Suit-BPT:
纯JAVA技术栈业务层自动化测试框架集，Maven工程结构，集成WebDriver, Junit驱动，使用Jenkins集成，报告使用surefire-report。

Test-Suit-IGT:
纯JAVA技术栈接口服务层自动化测试框架集，Maven工程结构，集成org.apache.commons / org.apache.httpcomponents / com.alibaba.fastjson / commons-httpclient / org.jsoup, Junit驱动，使用Jenkins集成，报告使用surefire-report。

Test-Suit-SPT:
JAVA+Scala混合技术栈服务器端性能测试框架集，Maven工程结构，集成io.gatling内核组件，gatling-maven-plugin驱动，使用Jenkins集成，报告使用gatling-charts-highcharts。