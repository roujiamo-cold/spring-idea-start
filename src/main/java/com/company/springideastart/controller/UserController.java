package com.company.springideastart.controller;

import com.company.springideastart.entity.User;
import com.company.springideastart.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzihao
 * @create 2020-10-19 17:41
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/user/{id}")
    public User getUserByID(@PathVariable(value = "id") Integer id) {
        User user = userService.getUserByID(id);
        return user;
    }

    @GetMapping(value = "/user/name")
    public User getUserByName(String name) {
        return userService.getUserByName(name);
    }
}
