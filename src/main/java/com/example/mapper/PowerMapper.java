package com.example.mapper;


import com.example.entity.Power;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PowerMapper {

    List<Power> findPowerAll();
}
