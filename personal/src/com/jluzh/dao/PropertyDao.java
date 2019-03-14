package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.jluzh.entity.Property;
import com.jluzh.utils.DataSourceUtils;

public class PropertyDao {

	public Property getInAndRe(String uid) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from property where uid=?";
		Property property = runner.query(sql, new BeanHandler<Property>(Property.class),uid);
		return property;
	}
    
}
