package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.UserMapper;
import com.admin.pojo.User;
import com.admin.pojo.UserExample;
import com.admin.pojo.UserExample.Criteria;

@Service
public class UserServiceImpl implements UserService {
	

	@Autowired(required = false)
	private UserMapper userMapper;

	@Override
	public List<User> query() throws Exception {
		UserExample userExample = new UserExample();
		Criteria createCriteria = userExample.createCriteria();
		createCriteria.andUidIsNotNull();
		List<User> list = userMapper.selectByExample(userExample);
		return list;
	}
	
	@Override
	public int delete(int uid) throws Exception {
		int d = userMapper.deleteByPrimaryKey(uid);
		return d;
	}

}
