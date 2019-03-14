package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.jluzh.entity.User;
import com.jluzh.utils.DataSourceUtils;

public class RegistDao {

	public boolean regist(String name) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where username=?";
		User user = runner.query(sql, new BeanHandler<User>(User.class),name);
		return user==null?false:true;
	}

	public boolean registInfo(User user) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into user values(?,?,?)";
		int update = runner.update(sql,user.getUid(),user.getUsername(),user.getPassword());
		return update>0?true:false;
	}
   
}
