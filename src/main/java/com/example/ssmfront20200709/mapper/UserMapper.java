package com.example.ssmfront20200709.mapper;

import com.example.ssmfront20200709.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    public User getUser(@Param("name")String name,@Param("password")String password);
    public List<User> getUserAll();
}
