package com.example.mapper;

import com.example.entity.Article;
import com.example.vo.ArticleAndAuthorNameVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper {

    /**
     * 查询文章和作者的编号和名称(通过强行拼接类属性)
     */

    List<ArticleAndAuthorNameVO> findArticleAndAuthorNameXml();



    /**
     * 查询所有文章带着作者信息
     */

    List<Article> findArticleAll();



}
