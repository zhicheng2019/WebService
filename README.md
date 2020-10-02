# WebService项目笔记
## WebService环境构建
+ 新建Maven的webapp项目
+ 在pom.xml文件中追加需要的类库
  ```xml
  <!--  Jersey容器类库2.x版本  -->
  <dependency>
    <groupId>org.glassfish.jersey.containers</groupId>
    <artifactId>jersey-container-servlet</artifactId>
    <version>2.1</version>
  </dependency>

  <!--  Jersey服务端类库2.x版本 -->
  <dependency>
    <groupId>org.glassfish.jersey.core</groupId>
    <artifactId>jersey-server</artifactId>
    <version>2.1</version>
  </dependency>

  <!--  JSON解析类库  -->
  <dependency>
      <groupId>com.owlike</groupId>
      <artifactId>genson</artifactId>
      <version>1.4</version>
  </dependency>
  ```
+ 配置web.xml
  ```xml
  <!--  Jersey容器的配置  -->
  <servlet>
    <servlet-name>jersey-serlvet</servlet-name>

    <servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>

    <init-param>
      <param-name>jersey.config.server.provider.packages</param-name>
      <param-value>com.dream.restfulapi</param-value>
    </init-param>

    <load-on-startup>1</load-on-startup>
  </servlet>

  <servlet-mapping>
    <servlet-name>jersey-serlvet</servlet-name>
    <url-pattern>/rest/*</url-pattern>
  </servlet-mapping>
  ```
+ 资源处理类定义
  ```java
    package com.dream.restfulapi.demo;
    
    import javax.ws.rs.Consumes;
    import javax.ws.rs.POST;
    import javax.ws.rs.Path;
    import javax.ws.rs.Produces;
    import javax.ws.rs.core.MediaType;
    
    @Path("/hellojson")
    public class HelloJsonReource {
    
        @POST
        @Path("/post")
        @Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
        public HelloJsonBean helloJson(HelloJsonBean reqHelloJsonBean) {
    
            //解析请求数据
            System.out.printf("reqHelloJsonBean:" + reqHelloJsonBean.toString());
              
            //返回数据编辑
            HelloJsonBean resHelloJsonBean = new HelloJsonBean();
    
            CommonInfo commonInfo = new CommonInfo();
            commonInfo.setCommon1("common1");
            commonInfo.setCommon2("common2");
    
            InputInfo inputInfo = new InputInfo();
            inputInfo.setInput1("input1");
            inputInfo.setInput2("input2");
    
            OutputInfo outputInfo= new OutputInfo();
            outputInfo.setOutput1("output1");
            outputInfo.setOutput2("output2");
    
            resHelloJsonBean.setCommonInfo(commonInfo);
            resHelloJsonBean.setInputInfo(inputInfo);
            resHelloJsonBean.setOutputInfo(outputInfo);
    
            return resHelloJsonBean;
        }
    
    }
  ```
+ 定义需要的bean类
  + HelloJsonBean
  + InputInfo
  + OutputInfo
  + CommonInfo
  
+ 启动Tomcat

  
  
  
+ 从postMan中请求URL
  
## 项目疏通确认
+ 启动tomcat,日志如下。
  ```
   

  ```
+ 浏览器输入下面的URI，测试tomcat   
  ```uri
  http://localhost:8080
  ```
  如果画面显示
  Hello World! API   
  那么tomcat配置成功。
+ 测试hellosService，在浏览器地址栏输入
  ```html
  http://localhost:8080/rest/hello/test
  ```
  画面显示   
  Jersey say : test
  则HelloService测试成功。

## 后台接收Json数据和解析Json数据

## 一些其他的问题
#### IDEA下的tomcat如何进行热部署


  
  