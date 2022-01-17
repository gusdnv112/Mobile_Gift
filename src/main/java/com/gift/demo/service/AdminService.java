package com.gift.demo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gift.demo.dao.AdminDao;


@Service
@Transactional
public class AdminService {
	
	
	@Autowired
	private AdminDao adminDao;
	
	public  List<HashMap<String, Object>>  getAllGiftList(){
		
		return adminDao.getAllGiftList();
		
	}
	
	
	public String addGift(HashMap<String, Object> vo) {
		int bool = adminDao.addGift(vo);
		if(bool == 1) {
			return "Data Insert Success";
		}
		
		return "Data input Failed";
	}

}
