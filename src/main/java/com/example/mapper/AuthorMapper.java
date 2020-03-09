package com.example.mapper;

import com.example.entity.Author;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorMapper {

    /**
     * 查询作者和作者的文章
     *
     */

    List<Author> findAuthorAll();
}
