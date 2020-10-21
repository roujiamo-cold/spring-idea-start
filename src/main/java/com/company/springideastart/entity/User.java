package com.company.springideastart.entity;

import lombok.Data;

/**
 * @author liuzihao
 * @create 2020-10-19 16:18
 **/
@Data
public class User {

    private Integer id;

    private String username;

    private String password;

    private Integer roleId;

}
