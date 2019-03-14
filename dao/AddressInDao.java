package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.Address;
import com.jluzh.utils.DataSourceUtils;

public class AddressInDao {

	public int insertAdd(Address address) throws SQLException {
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="insert into address values(?,?,?,?,?,?,?)";
		int	update = runner.update(sql,address.getUid(),address.getAid(),address.getName(),address.getPhone(),address.getLocation(),address.getCity(),
					address.getRemark());
		return update;
	}

}
