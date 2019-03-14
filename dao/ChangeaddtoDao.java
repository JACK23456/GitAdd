package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.Address;
import com.jluzh.utils.DataSourceUtils;

public class ChangeaddtoDao {

	public int changeadd(Address address) throws SQLException {
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="update address set name=?,phone=?,location=?,city=?,remark=? where aid=?";
        int update = runner.update(sql,address.getName(),address.getPhone(),address.getLocation(),
        		address.getCity(),address.getRemark(),address.getAid());
        return update;
	}
    
}
