package com.admin.service;

import java.util.List;

import com.admin.pojo.Post;


public interface PostService {
	
	public List<Post> findPost() throws Exception;
	public Post findPostById(Integer gid) throws Exception;
	public int updatePost(Post post) throws Exception;
	public int insert(Post post) throws Exception;
	public int delete(int gid) throws Exception;

}
