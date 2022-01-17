package com.gift.demo.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDao {
	
	 List<HashMap<String, Object>> getAllGiftList();
	 
	 int addGift(HashMap<String, Object> vo);
}
