package com.example.demo.service;/*
 * @Author stephen
 * @Description $
 * @Date $ $
 **/

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User sel(int id){
           User user=userMapper.sel(id);
           if(user==null){
               return null;
           }
            return userMapper.sel(id);


    }
}
