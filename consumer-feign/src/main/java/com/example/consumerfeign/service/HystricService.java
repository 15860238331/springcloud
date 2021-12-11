package com.example.consumerfeign.service;

import com.example.consumerfeign.pojo.User;

import java.util.List;

public class HystricService implements Userservice {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public User findUserByName(String username) {
        return null;
    }
}
