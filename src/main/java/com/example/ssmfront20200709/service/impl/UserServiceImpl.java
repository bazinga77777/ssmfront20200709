package com.example.ssmfront20200709.service.impl;

import com.example.ssmfront20200709.entity.User;
import com.example.ssmfront20200709.mapper.UserMapper;
import com.example.ssmfront20200709.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(String name,String password) {
        return userMapper.getUser(name,password);
    }

    @Override
    public List<User> getUserAll() {
        return userMapper.getUserAll();
    }
}
