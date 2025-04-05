package com.itkoma.service;

import java.util.List;

import com.itkoma.pojo.Cust;

public interface CustService {

	public int modifyCustById(Cust cust);
	
	public int deleteCustById(Cust cust);
	
	public Cust getCustById(String id);
	
	public List<Cust> getCustList();
	
	public int getCustListCount();
}
