package com.example.entity;

import lombok.Data;

import java.util.List;

/**
 * 多对多
 */

@Data
public class Power {
    private Long id;
    private String name;
    private List<Role> roles;
}
