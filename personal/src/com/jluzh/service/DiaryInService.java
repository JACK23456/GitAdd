package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.DiaryInDao;
import com.jluzh.entity.Diary;

public class DiaryInService {

	public boolean insertDia(Diary diary) {
		DiaryInDao dao = new DiaryInDao();
		int insert = 0;
		try {
			insert = dao.insertDia(diary);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return insert > 0 ? true : false;
	}

}
