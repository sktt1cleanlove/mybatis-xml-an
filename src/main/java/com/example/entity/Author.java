package com.example.entity;

import lombok.Data;

import java.util.List;

/**
 * 一对多(一方)
 */
@Data
public class Author {

    private Long id;
    private String name;

    private List<Article> articles;
}
