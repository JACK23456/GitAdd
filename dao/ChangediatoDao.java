package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.Diary;
import com.jluzh.utils.DataSourceUtils;

public class ChangediatoDao {

	public int changedia(Diary dia) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update diary set time=?,location=?,accident=?,people=? where diaid=?";
		int update = runner.update(sql,dia.getTime(),dia.getLocation(),dia.getAccident(),
				dia.getPeople(),dia.getDiaid());
		return update;
	}
    
}
