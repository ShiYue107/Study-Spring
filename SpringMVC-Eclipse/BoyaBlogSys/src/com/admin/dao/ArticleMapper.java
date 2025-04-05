package com.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.admin.pojo.Article;
import com.admin.pojo.ArticleExample;

public interface ArticleMapper {
    int countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExample(ArticleExample example);

    Article selectByPrimaryKey(Integer aid);
    
    List<Article> selectByArticle(@Param("pageSize")Integer pageSize,@Param("pageNum")Integer pageNum);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}