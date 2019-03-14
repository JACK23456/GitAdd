package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.ChangeaddtoDao;
import com.jluzh.entity.Address;

public class ChangeaddtoService {

	public boolean changeadd(Address address) {
        ChangeaddtoDao dao=new ChangeaddtoDao();
        int change=0;
        try {
			change=dao.changeadd(address);
		} catch (SQLException e) {
			e.printStackTrace();
		}
      return change>0?true:false;
	}
}
