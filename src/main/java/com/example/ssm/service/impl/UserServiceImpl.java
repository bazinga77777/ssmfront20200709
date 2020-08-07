package com.example.ssm.service.impl;

import com.example.ssm.entity.User;
import com.example.ssm.mapper.UserMapper;
import com.example.ssm.service.UserService;
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
