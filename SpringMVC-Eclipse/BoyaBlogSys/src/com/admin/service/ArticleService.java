package com.admin.service;

import java.util.List;

import com.admin.pojo.Article;


public interface ArticleService {
	public List<Article> findArticleById(Integer type) throws Exception;
	public List<Article> articlelist() throws Exception;
	public int updateArticle(Article article) throws Exception;
	public int delete(int aid) throws Exception;
	public int addarticle(Article article) throws Exception;
	public Article findItemsById(Integer aid) throws Exception;
}
