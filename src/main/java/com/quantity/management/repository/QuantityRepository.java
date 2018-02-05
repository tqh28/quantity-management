package com.quantity.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quantity.management.entity.Quantity;

public interface QuantityRepository extends JpaRepository<Quantity, Integer>{
	
	Quantity findByCode(String code);

}
