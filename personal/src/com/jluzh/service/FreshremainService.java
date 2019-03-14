package com.jluzh.service;

import java.sql.SQLException;
import java.util.List;

import com.jluzh.dao.FreshremainDao;
import com.jluzh.entity.ConsumeItem;

public class FreshremainService {

	public List<ConsumeItem> freshremain(String uid) {
		FreshremainDao dao=new FreshremainDao();
		List<ConsumeItem> list=null;
		try {
			list=dao.freshremain(uid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

    
}
