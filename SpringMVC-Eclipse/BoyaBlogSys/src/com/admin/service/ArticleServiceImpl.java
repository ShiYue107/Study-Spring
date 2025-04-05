package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.ArticleMapper;
import com.admin.pojo.Article;
import com.admin.pojo.ArticleExample;
import com.admin.pojo.ArticleExample.Criteria;

@Service
public class ArticleServiceImpl implements ArticleService{
	@Autowired(required = false)
	private ArticleMapper articleMapper;

	@Override
	public List<Article> findArticleById(Integer type) throws Exception {
		
		ArticleExample articleExample = new ArticleExample();
		Criteria createCriteria = articleExample.createCriteria();
		createCriteria.andTypeEqualTo(type);
		List<Article> list = articleMapper.selectByExample(articleExample);		
		return list;
	}
	@Override
	public List<Article> articlelist() throws Exception {
		ArticleExample articleExample = new ArticleExample();
		Criteria createCriteria = articleExample.createCriteria();
		createCriteria.andAidIsNotNull();
		List<Article> list = articleMapper.selectByExample(articleExample);
		return list;
	}
	@Override
	public int updateArticle(Article article) throws Exception {
		int n = articleMapper.updateByPrimaryKey(article);
		return n;
	}
	@Override
	public int delete(int aid) throws Exception {
		int n = articleMapper.deleteByPrimaryKey(aid);
		return n;
	}
	@Override
	public int addarticle(Article article) throws Exception {
		int n = articleMapper.insert(article);
		return n;
	}
	@Override
	public Article findItemsById(Integer aid) throws Exception {
		Article article = articleMapper.selectByPrimaryKey(aid);
		return article;
	}
}
