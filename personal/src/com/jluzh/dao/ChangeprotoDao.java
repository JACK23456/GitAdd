package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.Property;
import com.jluzh.utils.DataSourceUtils;

public class ChangeprotoDao {

	public boolean changeproto(Property pro) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="update property set income=?,remain=? where pid=?";
		int update = runner.update(sql,pro.getIncome(),pro.getRemain(),pro.getPid());
		return update>0?true:false;
	}
   
}
