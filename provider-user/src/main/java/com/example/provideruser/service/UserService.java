package com.example.provideruser.service;


import com.example.provideruser.pojo.User;

import java.util.List;

public interface UserService {
    boolean addUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

    User findUserByName(String username);

    List<User> findAll();

}
