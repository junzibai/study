package com.example.demo.controller;/*
 * @Author stephen
 * @Description $
 * @Date $ $
 **/

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {
        @Autowired
        private UserService userService;
        @RequestMapping("getUser/{id}")
        public String getUser(@PathVariable int id){
                User user =userService.sel(id);
                if(user==null){
                        return "查无此数";
                }
            return user.toString();
        }
}
