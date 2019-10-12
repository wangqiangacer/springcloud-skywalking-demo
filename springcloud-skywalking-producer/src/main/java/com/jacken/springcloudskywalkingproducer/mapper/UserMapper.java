package com.jacken.springcloudskywalkingproducer.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jacken.springcloudskywalkingproducer.domain.User;
import com.jacken.springcloudskywalkingproducer.request.UserRequest;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface UserMapper extends BaseMapper<User> {
    @Select("{call findUser(#{id, jdbcType = INTEGER, mode = IN})}")
    User findOne(Integer id);

    User selectUser(Integer id);

    User findConditon(@Param("request") UserRequest request);

    void updateUser(@Param("request") UserRequest request);

    List<User> findUserIds(List<Integer> ids);

    List<User> findUserMap(Map paramMap);

    User selectMap(@Param("request") UserRequest request);

    void insertUser(User user) ;


}
