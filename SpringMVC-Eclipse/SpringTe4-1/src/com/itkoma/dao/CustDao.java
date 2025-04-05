package com.itkoma.dao;

import java.util.List;

import com.itkoma.pojo.Cust;

public interface CustDao {

	public int modifyCustById(Cust cust);
	
	public int deleteCustById(Cust cust);
	
	public Cust getCustById(String custId);
	
	public List<Cust> getCustList();
	
	public int getCustListCount();
}
