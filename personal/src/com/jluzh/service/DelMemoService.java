package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.DelMemoDao;

public class DelMemoService {

	public boolean delmemo(String memotime) {
		DelMemoDao dao=new DelMemoDao();
		boolean isdel=false;
		try {
			isdel=dao.deladd(memotime);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isdel;
	}
   
}
