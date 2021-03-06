package com.dream.restfulapi.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hellojson")
public class HelloJsonResource {

    //日志
    public static final Logger log = LogManager.getLogger(HelloJsonResource.class);

    @POST //请求方法类型
    @Path("/post") //请求URI
    @Produces(MediaType.APPLICATION_JSON) //可请求的数据类型
    @Consumes(MediaType.APPLICATION_JSON) //可响应的数据类型
    /**
     * @parm   HelloJsonBean  请求体
     * @return HelloJsonBean  响应体
     */
    public HelloJsonBean helloJson(HelloJsonBean reqHelloJsonBean) {

        //日志输出
        log.info("Request Start!");

        //解析请求数据
        System.out.println("reqHelloJsonBean:" + reqHelloJsonBean.toString());


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

        log.info("Request End!");
        return resHelloJsonBean;
    }

}