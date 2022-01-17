package com.gift.demo.dto;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Alias("AdminDto")
public class AdminDto {
	
	int no;
	
	String vendor;
	
	String gift_name;
	
	int price;
	
	String image_url;
	
	Date created_at;
	
	Date updated_at;
	

}
