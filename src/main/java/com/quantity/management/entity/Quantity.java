package com.quantity.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Quantity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "code", length = 32, nullable = false, unique = true)
	private String code;
	
	@Column(name = "quantity", nullable = false)
	private Integer quantity;
	
	public Quantity() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
}
