package com.aws.repository;

import org.springframework.data.repository.CrudRepository;

import com.aws.model.Shop;

public interface ShopRepository extends CrudRepository<Shop, Integer> {

}
