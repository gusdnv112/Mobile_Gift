package com.gift.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gift.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	private final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private AdminService adminService;
	
	
	/**
	 * @apiNote 모든 Gift 가져오
	 * @return allGift
	 */
	@GetMapping(value="AllGiftList")
	public  List<HashMap<String, Object>>  getAllGiftList() {
	
		logger.info("getAllGiftList : {}", adminService.getAllGiftList().toString());
		
		return adminService.getAllGiftList();
	}
	
	/**
	 * @apiNote Gift 추가 API
	 * @param vo
	 * @return boolean
	 */
	
	@PostMapping(value="addGift")
	public String addGift(@RequestBody HashMap<String,Object> vo) {
		
		logger.info("Data : {}", vo);
		return adminService.addGift(vo);
		
		
	}

}
