package com.example.mapper;

import com.example.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleMapperTest {

    @Autowired
    RoleMapper roleMapper;

    @Test
    public void findRoleAll() {
        List<Role> roleAll = roleMapper.findRoleAll();
        System.out.println(roleAll);
    }
}