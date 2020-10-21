package com.company.springideastart.service.impl;

import com.company.springideastart.dao.UserMapper;
import com.company.springideastart.entity.User;
import com.company.springideastart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuzihao
 * @create 2020-10-19 17:39
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public User getUserByID(Integer id) {
        return userMapper.getUserByID(id);
    }
}
