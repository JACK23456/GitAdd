package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.utils.DataSourceUtils;

public class DelproDao {

	public boolean delpro(String income) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="delete from property where income=?";
		int update = runner.update(sql,income);
		return update>0?true:false;
	}

}
