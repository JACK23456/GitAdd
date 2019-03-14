package com.jluzh.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.jluzh.entity.ConsumeItem;
import com.jluzh.utils.DataSourceUtils;

public class FreshremainDao {

	public List<ConsumeItem> freshremain(String uid) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from consumeitem where uid=?";
		List<ConsumeItem> list = runner.query(sql,new BeanListHandler<ConsumeItem>(ConsumeItem.class),uid);
		return list;
	}


}
