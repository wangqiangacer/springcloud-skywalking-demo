package com.jacken.springcloudskywalkingproducer.request;

import lombok.Data;

@Data
public class UserRequest {
    private  Long id;
    private String name;
    private int age;
    private  String email;
    private  String phoneNo;
    private  String registerFrom;
}
