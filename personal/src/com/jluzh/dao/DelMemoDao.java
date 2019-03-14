package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.utils.DataSourceUtils;

public class DelMemoDao {

	public boolean deladd(String memotime) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="delete from memo where time=?";
		int update = runner.update(sql,memotime);
		return update>0?true:false;
	}
    
}
