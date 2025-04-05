package com.admin.service;

import java.util.List;

import com.admin.pojo.Admin;


public interface AdminService {
	public List<Admin> selectName(String supername) throws Exception;
	public List<Admin> queryList() throws Exception;
	public Admin queryById(int superid) throws Exception;
	public int update(Admin admin) throws Exception ;
	public int insert(Admin admin) throws Exception;
	public int delete(int superid) throws Exception;
}
