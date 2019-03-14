package com.jluzh.service;

import java.util.List;

import com.jluzh.dao.DiaryDao;
import com.jluzh.entity.Diary;

public class DiaryService {

	public List<Diary> getDiaryList(String uid) {
		DiaryDao dao = new DiaryDao();
		List<Diary> list = dao.getDiaryList(uid);
		return list;
	}
}
