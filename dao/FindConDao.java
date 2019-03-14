package com.jluzh.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.jluzh.entity.ConsumeItem;
import com.jluzh.utils.DataSourceUtils;

public class FindConDao {

	public List<ConsumeItem> findCon(String con) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from consumeitem where consumename like '"+con+"%'";
		List<ConsumeItem> list = runner.query(sql, new BeanListHandler<ConsumeItem>(ConsumeItem.class));
		return list;
	}
   
}
