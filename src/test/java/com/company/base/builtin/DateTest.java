package com.company.base.builtin;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @description: TODO
 * @author: 刘子豪 2021/5/18 14:59
 * @email: liuzihao29@jd.com
 */

public class DateTest {

    @Test
    public void testDate() {
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());


        Date date = new Date();
        System.out.println(date.getTime());

    }
}
