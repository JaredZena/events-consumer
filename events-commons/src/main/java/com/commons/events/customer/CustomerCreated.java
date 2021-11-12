package com.commons.events.customer;

import io.eventuate.tram.events.common.DomainEvent;

/**
 * The Class CustomerCreated.
 */
public class CustomerCreated extends BaseCustomer implements DomainEvent {
	
	public CustomerCreated(Integer customerId, String name){
		super(customerId, name);
	}

	public CustomerCreated() {
		super();
	}
	
}
