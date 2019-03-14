package com.jluzh.service;

import java.util.List;

import com.jluzh.dao.AddressDao;
import com.jluzh.entity.Address;

public class AddressService {

	public List<Address> getAddressList(String uid) {
		AddressDao address=new AddressDao();
		List<Address> list=address.getAddressList(uid);
		return list;
	}
    
}
