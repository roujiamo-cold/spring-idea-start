package com.company.buitin.date;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @description: TODO
 * @author: 刘子豪 2020/12/7 10:53
 * @email: liuzihao29@jd.com
 */

public class Main {

    public void rfc3339() throws Exception {
        String rfc3339TimeStr = "2015-05-20T13:29:35.120+08:00";
//        Date d = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse(rfc3339TimeStr);
//
//        System.out.println(d);


        System.out.println(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'+08:00'").parse(rfc3339TimeStr));

//        DateTimeFormatter formatter = DateTimeFormatter
//                .ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'ZZZZ'")
//                .withZone(ZoneId.of("UTC+8"));
//
//
//        System.out.println(formatter.format(ZonedDateTime.now()));
    }
}
