package com.admin.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.admin.dao.ZanMapper;
import com.admin.pojo.Zan;
import com.admin.pojo.ZanExample;
import com.admin.pojo.ZanExample.Criteria;

@Service
public class ZanServiceImpl implements ZanService{
	@Autowired(required = false)
	private ZanMapper zanMapper;
	
	@Override
	public List<Zan> findZanAll() throws Exception{
		ZanExample zanExample = new ZanExample();
		Criteria createCriteria = zanExample.createCriteria();
		createCriteria.andZidIsNotNull();
		List<Zan> list = zanMapper.selectByExample(zanExample);		
		return list;
	}
}
