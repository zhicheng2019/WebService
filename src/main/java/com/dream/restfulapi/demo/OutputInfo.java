package com.dream.restfulapi.demo;

/**
 * @author 匠人码农
 * @date 2020/09/13 20:10
 * 概要：
 *      出力情报
 */
public class OutputInfo {

    private String output1;
    private String output2;

    public String getOutput1() {
        return output1;
    }

    public void setOutput1(String output1) {
        this.output1 = output1;
    }

    public String getOutput2() {
        return output2;
    }

    public void setOutput2(String output2) {
        this.output2 = output2;
    }

    public String toString(){

        return  new StringBuffer().append(" output1:" + output1).append(" output2:" + output2).toString();
    }

}
