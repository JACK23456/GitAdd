package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.ConItemInDao;
import com.jluzh.entity.ConsumeItem;

public class ConItemInService {

	public boolean insertConItem(ConsumeItem conItem) {
		ConItemInDao dao = new ConItemInDao();
		int insert = 0;
		try {
			insert = dao.insertConItem(conItem);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return insert > 0 ? true : false;
	}

}
