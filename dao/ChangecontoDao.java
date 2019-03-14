package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.ConsumeItem;
import com.jluzh.utils.DataSourceUtils;

public class ChangecontoDao {

	public int changecon(ConsumeItem con) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update consumeitem set consumename=?,money=?,time=? where cid=?";
		int update = runner.update(sql, con.getConsumename(), con.getMoney(), con.getTime(),
				con.getCid());
		return update;
	}

}
