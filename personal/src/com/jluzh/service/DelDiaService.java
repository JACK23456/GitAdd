package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.DelDiaDao;

public class DelDiaService {

	public boolean deldia(String diatime) {
		DelDiaDao dao=new DelDiaDao();
		boolean isdel=false;
		try {
			isdel=dao.deladd(diatime);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isdel;
	}
   
}
