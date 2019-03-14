package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.AddDelDao;

public class AddDelService {

	public boolean deladd(String addname) {
		AddDelDao dao=new AddDelDao();
		boolean isdel=false;
		try {
			isdel=dao.deladd(addname);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isdel;
	}
}
