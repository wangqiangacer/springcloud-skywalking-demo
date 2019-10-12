package com.jacken.springcloudskywalkingproducer.controller;

import com.jacken.springcloudskywalkingproducer.domain.User;
import com.jacken.springcloudskywalkingproducer.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper   userMapper;

    @RequestMapping("/findOne")
    public User findOne(@RequestParam("id")  Integer id){
      return   userMapper.findOne(id);
    }
}
