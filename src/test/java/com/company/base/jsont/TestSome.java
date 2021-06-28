package com.company.base.jsont;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * @description: TODO
 * @author: 刘子豪 2021/1/25 11:05
 * @email: liuzihao29@jd.com
 */

public class TestSome {

    @Test
    public void testJsonMarshal() {
        Chinese chinese = new Chinese();
        chinese.setId("1234");
        chinese.setName("Beijing");
        chinese.setSex("man");
        chinese.setLanguage("hanyu");


        String s = JSON.toJSONString(chinese);
        System.out.println(s);

        String jsonStr = "{\"id\":\"1234\",\"language\":\"hanyu\",\"name\":\"Beijing\",\"sex\":\"man\"}";

        Chinese c2 = JSON.parseObject(jsonStr, Chinese.class);
        System.out.println(c2);
    }

    @Test
    public void fastJson1() {
        String s = JSON.toJSONString(null);
        System.out.println(s);
    }
}
