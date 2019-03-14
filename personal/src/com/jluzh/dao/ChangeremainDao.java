package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.utils.DataSourceUtils;

public class ChangeremainDao {

	public int changeremain(String uid,double remain) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="update property set remain=? where uid=?";
		return runner.update(sql,remain,uid);
	}
   
}
