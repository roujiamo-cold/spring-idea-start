package com.company.springideastart.dao;

import com.company.springideastart.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author liuzihao
 * @create 2020-10-19 16:19
 **/
@Mapper
@Repository
public interface UserMapper {

//    User selectUserModelByObj(User user);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User getUserByID(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("SELECT * FROM user WHERE username = #{name}")
    User getUserByName(@Param("name") String name);
}
