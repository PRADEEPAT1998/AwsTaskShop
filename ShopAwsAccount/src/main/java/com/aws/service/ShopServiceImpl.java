package com.aws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aws.model.Shop;
import com.aws.repository.ShopRepository;

@Component
public class ShopServiceImpl implements ShopService {

	@Autowired
	ShopRepository shopRepository;
	

	@Override
	public List<Shop> getDetail() {
		List<Shop> findAll = (List<Shop>) shopRepository.findAll();
		return findAll;
	}

	@Override
	public Shop updatedetail(int id , Shop details) {
		Shop updateDetail = shopRepository.findById(id).get();
		
		updateDetail.setName(details.getName());
		updateDetail.setAmount(details.getAmount());
		updateDetail.setCreationDateTime(details.getCreationDateTime());
		updateDetail.setLastUpdateDateTime(details.getLastUpdateDateTime());
		updateDetail.setStatus(details.isStatus());
		
		Shop saveUpdateddetail = shopRepository.save(updateDetail);
		return saveUpdateddetail;
	}

	@Override
	public void deleteDetail(int id) {
		shopRepository.deleteById(id);
	}

	@Override
	public Shop saveDetail(Shop shop) {
		
		return shopRepository.save(shop);
	}

	@Override
	public Shop findDetailOfId(Integer id) {
		
		return shopRepository.findById(id).orElse(null);
	}

}
