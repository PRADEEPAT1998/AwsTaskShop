package com.aws.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop_details")
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "amount")
	private int amount;

	@Column(name = "status")
	private boolean status;

	@Column(name = "creation_date_time")
	private LocalDate creationDateTime;

	@Column(name = "last_update_date_time")
	private LocalDate lastUpdateDateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDate getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(LocalDate creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public LocalDate getLastUpdateDateTime() {
		return lastUpdateDateTime;
	}

	public void setLastUpdateDateTime(LocalDate lastUpdateDateTime) {
		this.lastUpdateDateTime = lastUpdateDateTime;
	}

	


	
}
