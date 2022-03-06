package com.qiao.train.po;


public enum AppHttpCodeEnum {
    /**
     * 成功
     */
    SUCCESS(200,"登录成功"),
    /**
     * 自定义：最后一个注意用分号
     */
    FAILED(201,"登录失败"),
    AUTHORITY_NOT(503,"权限不足");

    int code;
    String msg;

    AppHttpCodeEnum(int code, String errorMessage) {
        this.code = code;
        this.msg = errorMessage;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

