package com.example.ssmfront20200709.service;

import com.example.ssmfront20200709.entity.User;

import java.util.List;

public interface UserService {

    public User getUser(String name,String password);
    public List<User> getUserAll();
}
