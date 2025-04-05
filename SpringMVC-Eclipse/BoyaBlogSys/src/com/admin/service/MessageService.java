package com.admin.service;

import java.util.List;

import com.admin.pojo.Message;


public interface MessageService {
	public List<Message>  findMessage() throws Exception;
	public int delete(int mid) throws Exception;
}
