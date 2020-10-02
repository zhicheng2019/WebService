package com.dream.restfulapi.demo;

/**
 * @author 匠人码农
 * @date 2020/09/13 11:47
 * 概要：
 *     入力情报
 */
public class InputInfo {

    private String input1;

    private String input2;

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    public String toString(){
        return new StringBuffer().append(" input1:" + input1).append(" input2:" + input2).toString();
    }

}
