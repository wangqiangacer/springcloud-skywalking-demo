package com.jacken.springcloudskywalkingconsumer.feign;

import com.jacken.springcloudskywalkingconsumer.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "springcloud-skywalking-producer")
public interface UserFeign {
    @GetMapping("/findOne")
    User findOne(@RequestParam("id")  Integer id);
}
