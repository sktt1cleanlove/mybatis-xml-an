package com.example.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {

    private Long id;
    private String name;
    private double money;
    private Long userId;

    private User user;
}
