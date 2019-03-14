package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.User;
import com.jluzh.utils.DataSourceUtils;

public class ChangepertoDao {

	public boolean changeperto(User user) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="update user set username=?,password=? where uid=?";
		int update = runner.update(sql,user.getUsername(),user.getPassword(),user.getUid());
		return update>0?true:false;
	}
    
}
