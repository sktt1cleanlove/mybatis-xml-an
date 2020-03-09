package com.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Long id;
    private String name;
    private String pwd;
    private List<Account> accounts;
}
