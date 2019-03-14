package com.jluzh.service;

import java.sql.SQLException;
import java.util.List;

import com.jluzh.dao.FindConDao;
import com.jluzh.entity.ConsumeItem;

public class FindConService {

	public List<ConsumeItem> findCon(String con) {
		FindConDao dao=new FindConDao();
		List<ConsumeItem> list=null;
		try {
			list = dao.findCon(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
   
}
