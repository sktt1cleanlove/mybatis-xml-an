package com.example.mapper;

import com.example.entity.User;
import com.example.form.QueryForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: czh;
 * @date: 2019/12/31;
 * @description: ;
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void findAll() {
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setId(3L);
        user.setName("ww");
        user.setPwd("123");
        userMapper.saveUser(user);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(3L);
        user.setName("zl");
        user.setPwd("123");
        userMapper.updateUser(user);

    }

    @Test
    public void deleteUser() {
        userMapper.deleteUser(3L);
    }

    @Test
    public void findByUserId() {
        User user = userMapper.findByUserId(2L);
        System.out.println(user);
    }

    @Test
    public void findByUserName() {
        List<User> zs = userMapper.findByUserName("zs");
        System.out.println(zs);
    }

    @Test
    public void findTotal() {
        int total = userMapper.findTotal();
        System.out.println(total);
    }

    @Test
    public void findAlices() {
        List<User> alices = userMapper.findAlices();
        System.out.println(alices);
    }

    @Test
    public void findAliceByUserId() {
        List<User> author = userMapper.findUserXml();


    }

    @Test
    public void saveUserXml() {
        User user = new User();
        user.setId(3L);
        user.setName("泰达米尔");
        user.setPwd("123");
        userMapper.saveUserXml(user);

        System.out.println(user);
    }


    @Test
    public void updateUserXml() {
        User user = new User();
        user.setId(3L);
        user.setName("寒冰射手");
        user.setPwd("123");
        int i = userMapper.updateUserXml(user);
        System.out.println(i);
    }

    @Test
    public void deleteUerXml() {
        int i = userMapper.deleteUserXml(3L);
        System.out.println(i);
    }

    @Test
    public void findByIdXml() {
        User byIdXml = userMapper.findByIdXml(2L);
        System.out.println(byIdXml);
    }

    @Test
    public void findByName() {
        List<User> byName = userMapper.findByName("z%");
        System.out.println(byName);
    }

    @Test
    public void countUserXml() {

        int i = userMapper.countUserXml();
        System.out.println(i);
    }

    @Test
    public void findByQueryFormIdXml() {
        QueryForm queryForm = new QueryForm();
        User user = new User();
        user.setId(1L);
        queryForm.setUser(user);
        User byQueryFormIdXml = userMapper.findByQueryFormIdXml(queryForm);
        System.out.println(byQueryFormIdXml);
    }

    /**
     *  mybatis-plus
     */
    @Test
    public void findAllUser() {
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

}