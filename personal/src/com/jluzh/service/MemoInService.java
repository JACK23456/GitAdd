package com.jluzh.service;

import java.sql.SQLException;

import com.jluzh.dao.MemoInDao;
import com.jluzh.entity.Memo;

public class MemoInService {

	public boolean insertMemo(Memo memo) {
		MemoInDao dao = new MemoInDao();
		int insert = 0;
		try {
			insert = dao.insertMemo(memo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return insert > 0 ? true : false;
	}

}
