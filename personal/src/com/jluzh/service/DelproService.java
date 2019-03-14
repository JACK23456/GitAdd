package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.DelproDao;

public class DelproService {

	public boolean delpro(String income) {
		DelproDao dao=new DelproDao();
		boolean isdel=false;
		try {
			isdel=dao.delpro(income);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isdel;
	}

}
