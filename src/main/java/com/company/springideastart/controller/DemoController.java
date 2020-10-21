package com.company.springideastart.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liuzihao
 * @create 2020-10-19 10:53
 **/
@Slf4j
@RequestMapping(value = "test")
@RestController
public class DemoController {

    @GetMapping(value = "/demo/{id}")
    public String demo(@PathVariable(value = "id") int id) {
        log.info(String.valueOf(id));
        return "hello world" + id;
    }

    @GetMapping(value = "/demo3")
    public String demo3(@RequestParam String name) {
        log.info(String.valueOf(name));
        return "hello world" + name;
    }

    @PostMapping(value = "/demo1")
    public List<String> demo1(@RequestParam String id) {
        log.info(id);
        List<String> list = Arrays.asList("1234", "qewqeweq", id);

        return list;
    }

    @PostMapping(value = "/demo2")
    public JSONObject demo2(@RequestParam String id) {

        JSONObject object = new JSONObject();
        object.put("name", "lzh");
        object.put("age", 35);

        List<String> hoby = Arrays.asList("qwe1", "qwe2", "qwe3", "qwe4");

        object.put("hoby", hoby);

        return "1".equals(id)? object: null;
    }
}
