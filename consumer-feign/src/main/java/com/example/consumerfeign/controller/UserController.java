package com.example.consumerfeign.controller;

import com.example.consumerfeign.pojo.User;
import com.example.consumerfeign.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private Userservice userService;
    @PostMapping(value = "/user")
    public boolean addUser(@RequestParam User user) {
        System.out.println("开始新增...");
        return userService.addUser(user);
    }

    @PutMapping(value = "/user")
    public boolean updateUser( @RequestParam User user) {
        System.out.println("开始更新...");
        return userService.updateUser(user);
    }

    @DeleteMapping(value = "/user")
    public boolean delete(@RequestParam int id) {
        System.out.println("开始删除...");
        return userService.deleteUser(id);
    }

    @GetMapping(value = "/user")
    public User findByUserName(@RequestParam String username) {
        System.out.println("开始查询...");
        return userService.findUserByName(username);
    }

    @GetMapping(value = "/users")
    public List<User> findByUserAge() {
        System.out.println("开始查询所有数据...");
        return userService.findAll();
    }
}
