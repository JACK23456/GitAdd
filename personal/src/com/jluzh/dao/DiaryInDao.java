package com.jluzh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jluzh.entity.Diary;
import com.jluzh.utils.DataSourceUtils;

public class DiaryInDao {

	public int insertDia(Diary diary) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="insert into diary values(?,?,?,?,?,?)";
		int	update = runner.update(sql,diary.getUid(),diary.getDiaid(),diary.getTime(),diary.getLocation(),diary.getAccident(),
				diary.getPeople());
		return update;
	}
    
}
