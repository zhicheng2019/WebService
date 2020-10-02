package com.dream.restfulapi.demo;

/**
 * @author 匠人码农
 * @date 2020/09/13 11:40
 * 概要：
 *     共通情报
 */
public class CommonInfo {
    private String common1;
    private String common2;

    public String getCommon1() {
        return common1;
    }

    public void setCommon1(String common1) {
        this.common1 = common1;
    }

    public String getCommon2() {
        return common2;
    }

    public void setCommon2(String common2) {
        this.common2 = common2;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        return sb.append(" common1:" + common1).append(" common2:" + common2).toString();
    }
}
