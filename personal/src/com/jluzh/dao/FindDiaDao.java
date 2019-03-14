package com.jluzh.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.jluzh.entity.Diary;
import com.jluzh.utils.DataSourceUtils;

public class FindDiaDao {

	public List<Diary> finddia(String dia) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from diary where time like '"+dia+"%'";
		List<Diary> list = runner.query(sql, new BeanListHandler<Diary>(Diary.class));
		return list;
	}
    
}
