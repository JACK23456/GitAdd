package com.jluzh.service;

import java.sql.SQLException;
import java.util.List;

import com.jluzh.dao.FindDiaDao;
import com.jluzh.entity.Diary;

public class FindDiaService {

	public List<Diary> finddia(String dia) {
		FindDiaDao dao=new FindDiaDao();
		List<Diary> list=null;
		try {
			list = dao.finddia(dia);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
    
}
