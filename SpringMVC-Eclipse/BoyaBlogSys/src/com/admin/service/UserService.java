package com.admin.service;

import java.util.List;

import com.admin.pojo.User;


public interface UserService {
	public List<User> query() throws Exception;
	public int delete(int uid) throws Exception;
}
