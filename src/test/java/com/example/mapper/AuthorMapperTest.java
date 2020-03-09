package com.example.mapper;

import com.example.entity.Author;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorMapperTest {

    @Autowired
    AuthorMapper authorMapper;

    @Test
    public void findAuthorAll() {
        List<Author> authorAll = authorMapper.findAuthorAll();
        System.out.println(authorAll);
        for (Author author : authorAll) {
            author.getArticles().forEach(a -> {
                System.out.println(a.getName());
            });
        }
    }
}