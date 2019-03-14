package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.Memo;
import com.jluzh.utils.DataSourceUtils;

public class ChangememotoDao {

	public int changememo(Memo memo) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update memo set time=?,location=?,accident=? where mid=?";
		int update = runner.update(sql, memo.getTime(),memo.getLocation(),memo.getAccident()
				,memo.getMid());
		return update;
	}
    
}
