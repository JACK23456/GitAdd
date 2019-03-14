package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.AddressInDao;
import com.jluzh.entity.Address;

public class AddressInService {

	public boolean insertAdd(Address address) {
		AddressInDao dao = new AddressInDao();
		int insert = 0;
		try {
			insert = dao.insertAdd(address);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return insert > 0 ? true : false;
	}
}
