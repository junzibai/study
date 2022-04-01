package com.example.demo.mapper;/*
 * @Author stephen
 * @Description $
 * @Date $ $
 **/

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
      User sel(int id);
}
