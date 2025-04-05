package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.admin.dao.MessageMapper;
import com.admin.pojo.Message;
import com.admin.pojo.MessageExample;
import com.admin.pojo.MessageExample.Criteria;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired(required = false)
	private MessageMapper messageMapper;
	
	
	@Override
	public List<Message> findMessage() throws Exception {
		MessageExample messageExample = new MessageExample();
		Criteria createCriteria = messageExample.createCriteria();
		createCriteria.andMidIsNotNull();
		List<Message> list = messageMapper.selectByExample(messageExample);		
		return list;
	}

	@Override
	public int delete(int mid) throws Exception {
		// TODO Auto-generated method stub
		int n = messageMapper.deleteByPrimaryKey(mid);
		return n;
	}

	
}
