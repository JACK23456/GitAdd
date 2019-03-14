package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.Property;
import com.jluzh.utils.DataSourceUtils;

public class PropertyInDao {

	public int proin(Property pro) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="insert into property values(?,?,?,?)";
		int	update = runner.update(sql,pro.getUid(),pro.getPid(),pro.getIncome(),pro.getRemain());
		return update;
	}
   
}
