package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.ChangecontoDao;
import com.jluzh.entity.ConsumeItem;

public class ChangecontoService {

	public boolean changecon(ConsumeItem con) {
		ChangecontoDao dao=new ChangecontoDao();
        int change=0;
        try {
			change=dao.changecon(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
      return change>0?true:false;
	}
    
}
