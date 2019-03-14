package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.ChangepertoDao;
import com.jluzh.entity.User;

public class ChangepertoService {

	public boolean changeperto(User user) {
        ChangepertoDao dao=new ChangepertoDao();
        boolean check=false;
		try {
			check = dao.changeperto(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return check;
	}
   
}
