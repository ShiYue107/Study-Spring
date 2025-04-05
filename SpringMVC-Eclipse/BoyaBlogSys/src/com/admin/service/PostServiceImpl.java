package com.admin.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.PostMapper;
import com.admin.pojo.Article;
import com.admin.pojo.Post;
import com.admin.pojo.PostExample;
import com.admin.pojo.PostExample.Criteria;

@Service
public class PostServiceImpl implements PostService {
	
	
	@Autowired(required = false)
	private PostMapper postMapper;

	@Override
	public List<Post> findPost() throws Exception {
		PostExample postexample = new PostExample();
		Criteria createCriteria = postexample.createCriteria();
		createCriteria.andGidIsNotNull();
		List<Post> list = postMapper.selectByExample(postexample);
		return list;
	}

	@Override
	public Post findPostById(Integer gid) throws Exception {
		Post posts = postMapper.selectByPrimaryKey(gid);
		return posts;
	}

	
	
	@Override
	public int updatePost(Post post) throws Exception {
		int n = postMapper.updateByPrimaryKey(post);
		return n;
	}
	
	
	@Override
	public int insert(Post post) throws Exception {
		int n = postMapper.insert(post);
		return n;
	}
	
	@Override
	public int delete(int gid) throws Exception {
		int n = postMapper.deleteByPrimaryKey(gid);
		return n;
	}
}
