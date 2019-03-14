package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.jluzh.entity.User;
import com.jluzh.utils.DataSourceUtils;

public class LoginDao {

	public User login(String name, String password) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where username=? and password=?";
		User user = runner.query(sql,new BeanHandler<User>(User.class),name,password);
		return user;
	}

	public User getUidbyName(String name) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where username=?";
		User user = runner.query(sql, new BeanHandler<User>(User.class),name);
		return user;
	}

   
}
