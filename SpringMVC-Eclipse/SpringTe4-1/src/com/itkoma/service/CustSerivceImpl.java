package com.itkoma.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.itkoma.dao.CustDao;
import com.itkoma.pojo.Cust;
@Repository("custService")
public class CustSerivceImpl implements CustService {

	@Resource(name = "custDao")
	private CustDao custDao;
	
	@Override
	public int modifyCustById(Cust cust) {
		int row = custDao.modifyCustById(cust);
		return row;
	}

	@Override
	public int deleteCustById(Cust cust) {
		int row = custDao.deleteCustById(cust);
		return row;
	}

	@Override
	public Cust getCustById(String id) {
		return custDao.getCustById(id);
	}

	@Override
	public List<Cust> getCustList() {
		List<Cust> list = custDao.getCustList();
		return list;
	}

	@Override
	public int getCustListCount() {
		Integer total = custDao.getCustListCount();
		return total;
	}

}
