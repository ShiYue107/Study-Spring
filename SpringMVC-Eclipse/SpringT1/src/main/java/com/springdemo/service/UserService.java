package com.springdemo.service;

import com.springdemo.dao.UserDao;
import com.springdemo.pojo.User;

public class UserService {
	private UserDao userDao;
	
	public User getUserInfo(String userId) {
		User user = userDao.getUserById(userId);
		return user;
	}
	
	public boolean insertUser(User user) {
		System.out.println("开启事务");
		userDao.insertUser(user);
		System.out.println("提交事务");
		System.out.println("关闭事务");
		return true;
	}
	
	public boolean updateUser(User user) {
		System.out.println("开启事务");
		userDao.updateUser(user);
		System.out.println("提交事务");
		System.out.println("关闭事务");
		return true;
	}
	
	public boolean delUser(User user) {
		System.out.println("开启事务");
		userDao.delUser(user);
		System.out.println("提交事务");
		System.out.println("关闭事务");
		return true;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
