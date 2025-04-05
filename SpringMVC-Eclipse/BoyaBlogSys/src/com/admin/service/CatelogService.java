package com.admin.service;

import java.util.List;

import com.admin.pojo.Catelog;


public interface CatelogService {
	public List<Catelog> selectCatelog() throws Exception;
	public List<Catelog> list() throws Exception;
	public int addcatelog(Catelog catelog) throws Exception;
	public int deletecatelog(int gid) throws Exception;
	public List<Catelog> querytype(int type) throws Exception;
	public Catelog queryByid(int gid) throws Exception;
	public int editCatelog(Catelog catelog) throws Exception;
	
}
