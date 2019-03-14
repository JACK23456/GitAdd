package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.LoginDao;
import com.jluzh.entity.User;

public class LoginService {

	public User login(String name, String password) {
		LoginDao dao=new LoginDao();
		User user=null;
	    try {
			user= (User) dao.login(name,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    return user;
	}

	public String getUidbyName(String name) {
		LoginDao dao=new LoginDao();
		User user=null;
		try {
			user = dao.getUidbyName(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user.getUid();
	}
}
