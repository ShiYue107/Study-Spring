package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.AdminMapper;
import com.admin.pojo.Admin;
import com.admin.pojo.AdminExample;
import com.admin.pojo.AdminExample.Criteria;

@Service
public class AdminServiceImpl implements  AdminService{
	
	@Autowired(required = false)
	private AdminMapper adminMapper;
	
	@Override
	public List<Admin> selectName(String supername) throws Exception {
		
		AdminExample adminExample = new AdminExample();
		Criteria createCriteria = adminExample.createCriteria();
		createCriteria.andSupernameEqualTo(supername);
		List<Admin> list = adminMapper.selectByExample(adminExample);
		return list;		
	}
	
	@Override
	public List<Admin> queryList() throws Exception {
		
		AdminExample adminExample = new AdminExample();
		Criteria createCriteria = adminExample.createCriteria();
		createCriteria.andSuperidIsNotNull();
		List<Admin> list = adminMapper.selectByExample(adminExample);
		return list;		
	}
	
	@Override
	public Admin queryById(int superid) throws Exception {
		Admin admin = adminMapper.selectByPrimaryKey(superid);
		return admin;		
	}
	
	@Override
	public int update(Admin admin) throws Exception {
		int n = adminMapper.updateByPrimaryKey(admin);
		return n;		
	}
	
	@Override
	public int insert(Admin admin) throws Exception {
		int n = adminMapper.insert(admin);
		return n;		
	}
	
	@Override
	public int delete(int superid) throws Exception {
		int n = adminMapper.deleteByPrimaryKey(superid);
		return n;		
	}
	
}
