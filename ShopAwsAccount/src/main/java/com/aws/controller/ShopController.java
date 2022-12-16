package com.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.model.Shop;
import com.aws.service.ShopService;

@RestController
@RequestMapping("/api")
public class ShopController {

	@Autowired
	ShopService shopService;
	
	@PostMapping("savedetails")
	public Shop uploadDetails(@RequestBody Shop shopDetails) {
			
		return shopService.saveDetail(shopDetails);
	}
	@GetMapping("findalldetails")
	public List<Shop> getAllDetails(){
		
		return shopService.getDetail();
	}
	@GetMapping("findbyid/{id}")
	public Shop findShopDetailById(@PathVariable int id) {
		
		return shopService.findDetailOfId(id);
	}
	
	@PutMapping("update/{id}")
	public Shop updateShopDetails(@PathVariable int id , @RequestBody Shop shop) {
		
		return shopService.updatedetail(id, shop);
	}
	@DeleteMapping("delete/{id}")
	public void deleteDetails(@PathVariable int id) {
		shopService.deleteDetail(id);
	}
	
	
}
