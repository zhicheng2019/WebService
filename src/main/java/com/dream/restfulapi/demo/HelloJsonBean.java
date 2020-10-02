package com.dream.restfulapi.demo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author 匠人码农
 * @date 2020/09/15 7:10
 * 概要：
 * XXXXX
 */
@XmlRootElement
public class HelloJsonBean {

    private CommonInfo commonInfo;
    private InputInfo inputInfo;
    private OutputInfo outputInfo;

    public CommonInfo getCommonInfo() {
        return commonInfo;
    }

    public void setCommonInfo(CommonInfo commonInfo) {
        this.commonInfo = commonInfo;
    }

    public InputInfo getInputInfo() {
        return inputInfo;
    }

    public void setInputInfo(InputInfo inputInfo) {
        this.inputInfo = inputInfo;
    }

    public OutputInfo getOutputInfo() {
        return outputInfo;
    }

    public void setOutputInfo(OutputInfo outputInfo) {
        this.outputInfo = outputInfo;
    }

    public String toString(){
        return new StringBuffer().append("commonInfo:" + this.commonInfo)
                .append(" inputInfo:" + inputInfo).append(" outputInfo:" + outputInfo).toString();
    }
}
