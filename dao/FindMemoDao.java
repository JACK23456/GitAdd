package com.jluzh.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.jluzh.entity.Memo;
import com.jluzh.utils.DataSourceUtils;

public class FindMemoDao {

	public List<Memo> findCon(String memo) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from memo where time like '"+memo+"%'";
		List<Memo> list = runner.query(sql, new BeanListHandler<Memo>(Memo.class));
		return list;
	}
   
}
