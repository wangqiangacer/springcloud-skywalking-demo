package com.jacken.springcloudskywalkingproducer;

import com.jacken.springcloudskywalkingproducer.domain.LoanProduct;
import com.jacken.springcloudskywalkingproducer.domain.User;
import com.jacken.springcloudskywalkingproducer.mapper.LoanProductMapper;
import com.jacken.springcloudskywalkingproducer.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudSkywalkingProducerApplicationTests {
    @Autowired
    private LoanProductMapper  loanProductMapper;
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.stream().forEach(user -> System.out.println(user));
    }

}
