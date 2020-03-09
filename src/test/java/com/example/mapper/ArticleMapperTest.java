package com.example.mapper;

import com.example.entity.Article;
import com.example.entity.Author;
import com.example.vo.ArticleAndAuthorNameVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleMapperTest {

    @Autowired
    ArticleMapper articleMapper;

    @Test
    public void findArticleAndAuthorNameXml() {
        List<ArticleAndAuthorNameVO> articleAndAuthorNameXml = articleMapper.findArticleAndAuthorNameXml();
        System.out.println(articleAndAuthorNameXml);
    }

    @Test
    public void findArticleAll() {

        List<Article> articleAll = articleMapper.findArticleAll();
        System.out.println(articleAll);
        articleAll.forEach(a -> {
            Author author = a.getAuthor();
        });
    }
}