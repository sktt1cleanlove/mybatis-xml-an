package com.example.entity;

import lombok.Data;

import java.util.List;

/**
 * 多对多
 */

@Data
public class Role {
    private Long id;
    private String name;
    private List<Power> powers;
}
