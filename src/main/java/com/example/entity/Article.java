package com.example.entity;

import lombok.Data;

/**
 * 一对多(多方)
 */
@Data
public class Article {
    private Long id;
    private String name;
    private Long authorId;

    private Author author;
}
