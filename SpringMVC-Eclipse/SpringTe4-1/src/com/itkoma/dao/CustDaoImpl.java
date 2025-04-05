package com.itkoma.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.itkoma.pojo.Cust;
@Repository("custDao")
public class CustDaoImpl implements CustDao {

	@Resource(name="jdbcTemplate")
	private JdbcTemplate template;
	
	@Override
	public int modifyCustById(Cust cust) {
		String phone = cust.getPhone();
		String id = cust.getCustId();
		String sql = "update tb_cust set phone=? where custId=?";
		int row = template.update(sql,phone,id);
		return row;
	}
	@Override
	public int deleteCustById(Cust cust) {
		String id = cust.getCustId();
		String sql = "delete from tb_cust where custId=?";
		int row = template.update(sql,id);
		return row;
	}
	@Override
	public Cust getCustById(String custId) {
		String sql = "select custId,custName,phone,address from tb_cust "
				+ "where custId=?";
		RowMapper rm = new RowMapper();
		return template.queryForObject(sql,rm,custId);
	}
	@Override
	public List<Cust> getCustList() {
		String sql = "select custId,custName,phone,address from tb_cust";
		RowMapper rm = new RowMapper();
		List<Cust> list = template.query(sql,rm);
		return list;
	}
	@Override
	public int getCustListCount() {
		String sql = "select count(*) from tb_cust";
		Integer total = template.queryForObject(sql, Integer.class);
		return total;
	}

}
