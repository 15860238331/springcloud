package com.example.consumerfeign.service;

import com.example.consumerfeign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "provider-user",fallback = HystricService.class)
public interface Userservice {
    @GetMapping("/users")
    List<User> findAll();
    @PostMapping("/user")
    boolean addUser(User user);
    @PutMapping("/user")
    boolean updateUser(User user);
    @DeleteMapping("/user")
    boolean deleteUser(@RequestParam int id);
    @GetMapping("/user")
    User findUserByName(String username);

}
