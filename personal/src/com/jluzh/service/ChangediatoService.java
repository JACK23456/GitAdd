package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.ChangediatoDao;
import com.jluzh.entity.Diary;

public class ChangediatoService {

	public boolean changedia(Diary dia) {
		ChangediatoDao dao=new ChangediatoDao();
        int change=0;
        try {
			change=dao.changedia(dia);
		} catch (SQLException e) {
			e.printStackTrace();
		}
      return change>0?true:false;
	}

}
