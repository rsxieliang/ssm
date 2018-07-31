package com.xl.common;

/**
 * @author xieliang
 * @Description
 * @Date Create in 下午 4:02 2018-03-26
 * Modified By:
 */
public enum Scopes {
    /**
     * 单例 默认
     */
    SINGLEGEN("singleton"),
    /**
     * 原型 每次都生成不同的对象
     */
    PROTOTYPE("prototype"),
    /**
     * bean 的作用范围为一次请求 请求响应完成后 清空
     */
    REQUEST("request"),
    /**
     * bean 的作用范围session
     */
    SESSION("session"),
    GoBAL_SESSION("globalsession");

    private String name;

     Scopes(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
