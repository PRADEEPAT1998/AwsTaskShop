package com.aws.service;

import java.util.List;

import com.aws.model.Shop;

public interface ShopService {

	Shop saveDetail(Shop shop);
	
	List<Shop> getDetail();
	
	Shop findDetailOfId(Integer id);
	
	Shop updatedetail(int id , Shop details);
	
	void deleteDetail(int id);
}
