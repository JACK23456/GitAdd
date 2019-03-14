package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.DelConDao;

public class DelConService {

	public boolean delCon(String conname) {
		DelConDao dao=new DelConDao();
		boolean isdel=false;
		try {
			isdel=dao.delCon(conname);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isdel;
	}
   
}
