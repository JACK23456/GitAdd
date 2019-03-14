package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.PropertyInDao;
import com.jluzh.entity.Property;

public class PropertyInService {

	public boolean proin(Property pro) {
		PropertyInDao dao = new PropertyInDao();
		int insert = 0;
		try {
			insert = dao.proin(pro);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return insert > 0 ? true : false;
	}
   
}
