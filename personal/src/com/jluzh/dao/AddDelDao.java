package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.utils.DataSourceUtils;

public class AddDelDao {

	public boolean deladd(String addname) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="delete from address where name=?";
		int update = runner.update(sql,addname);
		return update>0?true:false;
	}
    
}
