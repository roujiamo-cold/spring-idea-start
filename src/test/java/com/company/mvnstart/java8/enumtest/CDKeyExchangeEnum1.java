package com.company.mvnstart.java8.enumtest;

/**
 * @description: TODO
 * @author: 刘子豪 2020/12/8 17:15
 * @email: liuzihao29@jd.com
 */

public enum CDKeyExchangeEnum1 {
    EXPIRED(5002);

    private int code;

    CDKeyExchangeEnum1(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
