package com.company.mvnstart.java8.enumtest;

public enum CDKeyExchangeEnum {

    EXPIRED("5002", "兑换码已过期"),
    USED("5003", "兑换码已使用"),
    UNKNOWN("9999", "发放失败，请与券码发放方联系");

    private final String code;
    private final String msg;

    CDKeyExchangeEnum(final String code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
