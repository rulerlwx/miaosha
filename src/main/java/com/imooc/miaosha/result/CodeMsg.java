package com.imooc.miaosha.result;

/**
 * Created by lwx on 2019/8/15.
 */
public class CodeMsg {
    private int code;
    private String msg;

    //通用异常 5001xx
    public static CodeMsg SUCCESS = new CodeMsg(0,"success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100,"服务端异常");

    //登录模块 5002xxx

    //端口模块 5003xxx

    //订单模块 5004xxx

    //秒杀模块 5005xxx

    public CodeMsg(int code, String msg) {
        this.code = code;
        this.msg =msg;
    }

    public int getCode() {
        return code;
    }
    
    public String getMsg() {
        return msg;
    }
}
