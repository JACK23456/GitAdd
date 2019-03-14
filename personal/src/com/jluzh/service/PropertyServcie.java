package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.PropertyDao;
import com.jluzh.entity.Property;

public class PropertyServcie {

	public Property getInAndRe(String uid) {
		PropertyDao dao=new PropertyDao();
		Property property=null;
		try {
			property = dao.getInAndRe(uid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return property;
	}
   
}
