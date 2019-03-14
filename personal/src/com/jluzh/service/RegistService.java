package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.RegistDao;
import com.jluzh.entity.User;

public class RegistService {

	public boolean regist(String name) {
		RegistDao dao = new RegistDao();
		boolean check=false;
		try {
			check=dao.regist(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}

	public boolean registInfo(User user) {
		RegistDao dao = new RegistDao();
		boolean check=false;
		try {
			check=dao.registInfo(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	
}
