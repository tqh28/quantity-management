package com.quantity.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.quantity.management.entity.Quantity;
import com.quantity.management.repository.QuantityRepository;

@RestController
public class APIController {
	
	@Autowired
	private QuantityRepository quantityRepository;

	@GetMapping("/stock-availability/{code}")
	@CrossOrigin
	public Quantity getStockAvailability(@PathVariable("code") String code) {
		return quantityRepository.findByCode(code);
	}
}
