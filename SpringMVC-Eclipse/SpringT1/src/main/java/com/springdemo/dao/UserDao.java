package com.springdemo.dao;

import com.springdemo.pojo.User;

public class UserDao {
	
	public User getUserById(String userId) {
		User user = new User("2345","lisi","123456",16,"yunnanKunMing","1");
		return user;
	}
	
	public boolean insertUser(User user) {
		System.out.println("�������ݣ�"+user.getUserId()+","+user.getUserName()+","+user.getPassword()+
							","+user.getAge()+","+user.getAddress()+","+user.getFlag());
		return true;
	}
	
	public boolean updateUser(User user) {
		System.out.println("�޸��û����"+user.getUserId()+"������Ϊ��"+user.getPassword());
		return true;
	}

	public boolean delUser(User user) {
		System.out.println("ɾ���û����"+user.getUserId()+"������");
		return true;
	}
}
