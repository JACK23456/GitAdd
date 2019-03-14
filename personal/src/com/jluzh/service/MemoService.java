package com.jluzh.service;

import java.util.List;

import com.jluzh.dao.MemoDao;
import com.jluzh.entity.Memo;

public class MemoService {

	public List<Memo> getMemoList(String uid) {
		MemoDao dao = new MemoDao();
		List<Memo> list = dao.getMemoList(uid);
		return list;
	}

}
