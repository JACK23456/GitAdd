package com.jluzh.service;

import java.sql.SQLException;
import java.util.List;

import com.jluzh.dao.FindMemoDao;
import com.jluzh.entity.Memo;

public class FindMemoService {

	public List<Memo> findAdd(String memo) {
		FindMemoDao dao=new FindMemoDao();
		List<Memo> list=null;
		try {
			list = dao.findCon(memo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
   
}
