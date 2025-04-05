package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.CommentMapper;
import com.admin.pojo.Comment;
import com.admin.pojo.CommentExample;
import com.admin.pojo.CommentExample.Criteria;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired(required = false)
	private CommentMapper commentMapper;
	
	@Override
	public List<Comment> queryAll() throws Exception {
		CommentExample commentExample = new CommentExample();
		Criteria createCriteria = commentExample.createCriteria();
		createCriteria.andCidIsNotNull();
		List<Comment> list = commentMapper.selectByExample(commentExample);		
		return list;
	}
	@Override
	public int deleteByAid(int aid) throws Exception {
		CommentExample commentExample = new CommentExample();
		Criteria createCriteria = commentExample.createCriteria();
		createCriteria.andAidEqualTo(aid);
		int a = commentMapper.deleteByExample(commentExample);	
		return a;
	}
	@Override
	public int deleteByCid(int cid) throws Exception {
		int n = commentMapper.deleteByPrimaryKey(cid);
		return n;
	}
}
