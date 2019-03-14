package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.utils.DataSourceUtils;

public class DelConDao {

	public boolean delCon(String conname) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="delete from consumeitem where consumename=?";
		int update = runner.update(sql,conname);
		return update>0?true:false;
	}

}
