package com.itkoma.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.itkoma.pojo.User;
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Resource(name="jdbcTemplate")
	private JdbcTemplate template;
	
	@Override
	public int insertUser(User us) {
		int id = us.getId();
		String name = us.getName();
		String pwd = us.getPassword();
		String sql = "insert into tb_user values(?,?,?)";
		int row = template.update(sql,id,name,pwd);
		return row;
	}

}
