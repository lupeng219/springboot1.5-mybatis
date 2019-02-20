package com.example.service;

import com.example.model.User;

import java.util.List;

/**
 * lupeng
 * 2019/2/19
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
