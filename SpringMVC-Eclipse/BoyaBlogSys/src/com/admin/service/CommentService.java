package com.admin.service;

import java.util.List;

import com.admin.pojo.Comment;


public interface CommentService {
	public List<Comment> queryAll() throws Exception;
	public int deleteByAid(int aid) throws Exception;
	public int deleteByCid(int cid) throws Exception;
}
