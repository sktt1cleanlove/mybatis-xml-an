package com.example.vo;


import com.example.entity.Article;
import lombok.Data;

@Data
public class ArticleAndAuthorNameVO extends Article {

    private String authorName;
}
