package com.commons.events.customer;

public class BaseCustomer {
	
	private Integer customerId;

	private String name;
	
	public BaseCustomer() {
		super();
	}
	
	public BaseCustomer(Integer customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
