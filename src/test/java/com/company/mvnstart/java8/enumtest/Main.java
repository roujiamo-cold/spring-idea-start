package com.company.mvnstart.java8.enumtest;

import org.junit.jupiter.api.Test;

/**
 * @description: TODO
 * @author: 刘子豪 2020/12/8 17:09
 * @email: liuzihao29@jd.com
 */

public class Main {

    @Test
    public void test() {
        String str = "5001";
        final String str2 = "xxx";

        CDKeyExchangeEnum cdKeyExchangeEnum1 = CDKeyExchangeEnum.EXPIRED;

        switch (cdKeyExchangeEnum1) {
            case UNKNOWN:
                break;
            case USED:
        }
    }
}
