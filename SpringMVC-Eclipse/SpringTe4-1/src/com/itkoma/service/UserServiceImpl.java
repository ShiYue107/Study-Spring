package com.itkoma.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itkoma.dao.UserDao;
import com.itkoma.pojo.User;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public int insertUser(User us) {
		int row = userDao.insertUser(us);
		int i = 1/0;
		return row;
	}

}
