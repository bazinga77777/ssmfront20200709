package com.example.ssm.service;

import com.example.ssm.entity.User;

import java.util.List;

public interface UserService {

    public User getUser(String name,String password);
    public List<User> getUserAll();
}
