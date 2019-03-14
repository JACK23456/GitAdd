package com.jluzh.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.jluzh.entity.Memo;
import com.jluzh.utils.DataSourceUtils;

public class MemoDao {

	public List<Memo> getMemoList(String uid) {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from memo where uid=?";
		List<Memo> list =null;
		try {
			list = runner.query(sql, new BeanListHandler<Memo>(Memo.class),uid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
