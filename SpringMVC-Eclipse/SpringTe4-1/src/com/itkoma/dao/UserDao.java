package com.itkoma.dao;

import org.springframework.stereotype.Component;

import com.itkoma.pojo.User;
@Component
public interface UserDao {
	public int insertUser(User us); 
}
