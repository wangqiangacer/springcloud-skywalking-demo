package com.jacken.springcloudskywalkingeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudSkywalkingEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSkywalkingEurekaApplication.class, args);
    }

}
