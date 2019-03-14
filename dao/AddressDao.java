package com.jluzh.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.jluzh.entity.Address;
import com.jluzh.utils.DataSourceUtils;

public class AddressDao {

	public List<Address> getAddressList(String uid) {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from address where uid=?";
		List<Address> list =null;
		try {
			list = runner.query(sql, new BeanListHandler<Address>(Address.class),uid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
  
}
