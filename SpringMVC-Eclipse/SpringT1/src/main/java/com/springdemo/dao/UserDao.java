package com.springdemo.dao;

import com.springdemo.pojo.User;

public class UserDao {
	
	public User getUserById(String userId) {
		User user = new User("2345","lisi","123456",16,"yunnanKunMing","1");
		return user;
	}
	
	public boolean insertUser(User user) {
		System.out.println("插入数据："+user.getUserId()+","+user.getUserName()+","+user.getPassword()+
							","+user.getAge()+","+user.getAddress()+","+user.getFlag());
		return true;
	}
	
	public boolean updateUser(User user) {
		System.out.println("修改用户编号"+user.getUserId()+"的密码为："+user.getPassword());
		return true;
	}

	public boolean delUser(User user) {
		System.out.println("删除用户编号"+user.getUserId()+"的数据");
		return true;
	}
}
