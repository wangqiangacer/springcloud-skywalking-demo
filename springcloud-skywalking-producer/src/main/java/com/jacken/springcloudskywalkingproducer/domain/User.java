package com.jacken.springcloudskywalkingproducer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("User")
public class User {
    private  Long id;
    private String name;
    private int age;
   private  String email;
}
