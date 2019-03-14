package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.utils.DataSourceUtils;

public class DelDiaDao {

	public boolean deladd(String diatime) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="delete from diary where time=?";
		int update = runner.update(sql,diatime);
		return update>0?true:false;
	}

}
