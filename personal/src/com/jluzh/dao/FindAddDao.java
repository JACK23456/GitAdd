package com.jluzh.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.jluzh.entity.Address;
import com.jluzh.utils.DataSourceUtils;

public class FindAddDao {

	public List<Address> findAdd(String add) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from address where name like '"+add+"%'";
		List<Address> list = runner.query(sql, new BeanListHandler<Address>(Address.class));
		return list;
	}
    
}
