package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.Memo;
import com.jluzh.utils.DataSourceUtils;

public class MemoInDao {

	public int insertMemo(Memo memo) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="insert into memo values(?,?,?,?,?)";
		int	update = runner.update(sql,memo.getUid(),memo.getMid(),memo.getTime(),memo.getAccident(),
				memo.getLocation());
		return update;
	}
     
}
