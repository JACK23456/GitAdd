package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.ChangememotoDao;
import com.jluzh.entity.Memo;

public class ChangememotoService {

	public boolean changememo(Memo memo) {
		  ChangememotoDao dao=new ChangememotoDao();
	        int change=0;
	        try {
				change=dao.changememo(memo);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	      return change>0?true:false;
	}
     
}
