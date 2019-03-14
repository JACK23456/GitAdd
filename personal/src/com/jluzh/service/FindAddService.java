package com.jluzh.service;

import java.sql.SQLException;
import java.util.List;

import com.jluzh.dao.FindAddDao;
import com.jluzh.entity.Address;

public class FindAddService {

	public List<Address> findAdd(String add) {
		FindAddDao dao=new FindAddDao();
		List<Address> list=null;
		try {
			list = dao.findAdd(add);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
    
}
