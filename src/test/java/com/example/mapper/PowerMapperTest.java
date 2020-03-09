package com.example.mapper;

import com.example.entity.Power;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PowerMapperTest {

    @Autowired
    PowerMapper powerMapper;

    @Test
    public void findPowerAll() {
        List<Power> powerAll = powerMapper.findPowerAll();
        System.out.println(powerAll);
    }
}