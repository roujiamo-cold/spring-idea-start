package com.company.springideastart.service;

import com.company.springideastart.dao.UserMapper;
import com.company.springideastart.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuzihao
 * @create 2020-10-19 17:36
 **/
public interface UserService {

    User getUserByName(String name);

    User getUserByID(Integer id);
}
