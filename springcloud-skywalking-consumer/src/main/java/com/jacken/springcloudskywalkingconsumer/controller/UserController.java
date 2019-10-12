package com.jacken.springcloudskywalkingconsumer.controller;

import com.jacken.springcloudskywalkingconsumer.domain.User;
import com.jacken.springcloudskywalkingconsumer.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserFeign userFeign;
    @RequestMapping("/findOne")
    public User findOne(@RequestParam("id") Integer id){
       return userFeign.findOne(id) ;
    }
}
