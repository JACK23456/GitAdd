package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.ConsumeItem;
import com.jluzh.utils.DataSourceUtils;

public class ConItemInDao {

	public int insertConItem(ConsumeItem conItem) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="insert into consumeitem values(?,?,?,?,?)";
		int	update = runner.update(sql,conItem.getUid(),conItem.getCid(),conItem.getConsumename(),conItem.getMoney(),
					conItem.getTime());
		return update;
	}
   
}
