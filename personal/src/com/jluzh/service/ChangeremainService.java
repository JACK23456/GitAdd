package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.ChangeremainDao;

public class ChangeremainService {

	public boolean changeremain(String uid,double remain) {
		ChangeremainDao dao=new ChangeremainDao();
		int check=0;
		try {
			check=dao.changeremain(uid,remain);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check>0?true:false;
	}
   
}
