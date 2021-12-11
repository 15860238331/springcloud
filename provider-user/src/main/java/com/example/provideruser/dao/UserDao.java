package com.example.provideruser.dao;

import com.example.provideruser.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserDao {
    @Insert("insert into user_info(id,username,password,birthday,sex) values (#{id},#{username},#{password},#{birthday},#{sex})")
    void addUser(User user);


    @Update("update user_info set username=#{username},password=#{password},birthday=#{birthday},sex=#{sex} where id=#{id}")
    void updateUser(User user);


    @Delete("delete from user_info where id=#{id}")
    void deleteUser(int id);


    @Select("SELECT id,username,password,birthday,sex FROM user_info where username=#{userName}")
    User findByName(@Param("userName") String userName);


    @Select("SELECT id,username,password,birthday,sex FROM user_info")
    List<User> findAll();

}
