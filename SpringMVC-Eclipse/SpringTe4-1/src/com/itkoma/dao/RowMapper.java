package com.itkoma.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.itkoma.pojo.Cust;

public class RowMapper implements org.springframework.jdbc.core.RowMapper<Cust>{

	@Override
	public Cust mapRow(ResultSet rs,int arg1) throws SQLException {
		Cust cust = new Cust();
		cust.setCustId(rs.getString("custId"));
		cust.setCustName(rs.getString("custName"));
		cust.setPhone(rs.getString("phone"));
		cust.setAddress(rs.getString("address"));
		return cust;
	}
}
