package com.example;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnMybatisApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
//        List<User> all = userMapper.findAll();
//        System.out.println(all);
    }

}
