package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.admin.dao.CatelogMapper;
import com.admin.pojo.Catelog;
import com.admin.pojo.CatelogExample;
import com.admin.pojo.CatelogExample.Criteria;

@Service
public class CatelogServiceImpl implements  CatelogService{
	@Autowired(required = false)
	private CatelogMapper catelogMapper;

	@Override
	public List<Catelog> selectCatelog() throws Exception {
		CatelogExample catelogExample = new CatelogExample();
		Criteria createCriteria = catelogExample.createCriteria();
		createCriteria.andTypeIsNotNull();
		List<Catelog> list = catelogMapper.selectByExample(catelogExample);
		return list;
	}



	@Override
	public List<Catelog> list() throws Exception {
		// TODO Auto-generated method stub
		CatelogExample catelogExample = new CatelogExample();
		Criteria createCriteria = catelogExample.createCriteria();
		createCriteria.andGidIsNotNull();
		List<Catelog> list = catelogMapper.selectByExample(catelogExample);
		return list;
	}
	
	
	@Override
	public List<Catelog> querytype(int type) throws Exception {
		// TODO Auto-generated method stub
		CatelogExample catelogExample = new CatelogExample();
		Criteria createCriteria = catelogExample.createCriteria();
		createCriteria.andTypeEqualTo(type);
		List<Catelog> list = catelogMapper.selectByExample(catelogExample);
		return list;
	}
	
	@Override
	public int addcatelog(Catelog catelog) throws Exception {
		// TODO Auto-generated method stub
		int n = catelogMapper.insertSelective(catelog);
		return n;
	}
	
	@Override
	public int deletecatelog(int gid) throws Exception {
		// TODO Auto-generated method stub
		int n = catelogMapper.deleteByPrimaryKey(gid);
		return n;
	}



	@Override
	public Catelog queryByid(int gid) throws Exception {
		// TODO Auto-generated method stub
		Catelog catelog = catelogMapper.selectByPrimaryKey(gid);
		return catelog;
	}



	@Override
	public int editCatelog(Catelog catelog) throws Exception {
		// TODO Auto-generated method stub
		int n = catelogMapper.updateByPrimaryKey(catelog);
		return n;
	}

	
}
