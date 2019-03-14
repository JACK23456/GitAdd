package com.jluzh.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.jluzh.entity.Diary;
import com.jluzh.utils.DataSourceUtils;

public class DiaryDao {
	public List<Diary> getDiaryList(String uid) {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from diary where uid=?";
		List<Diary> list =null;
		try {
			list = runner.query(sql, new BeanListHandler<Diary>(Diary.class),uid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
