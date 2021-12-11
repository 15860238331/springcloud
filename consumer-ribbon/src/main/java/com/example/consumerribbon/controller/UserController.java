package com.example.consumerribbon.controller;

import com.example.consumerribbon.pojo.User;
import com.example.consumerribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;
       @PostMapping(value = "/user")
      public boolean addUser(@RequestParam User user) {
      System.out.println("开始新增...");
      return  restTemplate.getForObject("http://provider-user/user",null,Boolean.class);
}

    @PutMapping(value = "/user")
    public boolean updateUser( @RequestParam User user) {
        System.out.println("开始更新...");
        return restTemplate.postForEntity("http://provider-user/user",user,Boolean.class).getBody();
    }

    @DeleteMapping(value = "/user")
    public boolean delete(@RequestParam int id) {
        System.out.println("开始删除...");
        return  restTemplate.getForObject("http://provider-user/user",null,Boolean.class);
    }

    @GetMapping(value = "/user")
    public User findByUserName(@RequestParam String username) {
        System.out.println("开始查询...");
        return  restTemplate.postForEntity("http://provider-user/user",username,User.class).getBody();
    }

    @GetMapping(value = "/users")
    public List<User> findByUserAge() {
        System.out.println("开始查询所有数据...");
        return  restTemplate.getForObject("http://provider-user/users",List.class);
    }

}
