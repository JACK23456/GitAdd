package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.ChangeprotoDao;
import com.jluzh.entity.Property;

public class ChangeprotoService {

	public boolean changeproto(Property pro) {
		ChangeprotoDao dao=new ChangeprotoDao();
        boolean check=false;
		try {
			check = dao.changeproto(pro);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return check;
	}
   
}
