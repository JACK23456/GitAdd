package com.jluzh.service;

import java.util.List;

import com.jluzh.dao.ConItemDao;
import com.jluzh.entity.ConsumeItem;

public class ConItemService {

	public List<ConsumeItem> getConItemList(String uid) {
		ConItemDao dao = new ConItemDao();
		List<ConsumeItem> list = dao.getConItemList(uid);
		return list;
	}
   
}
