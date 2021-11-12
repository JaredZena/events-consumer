package com.commons.events.customer;

import io.eventuate.tram.events.common.DomainEvent;

/**
 * The Class CustomerUpdated.
 */
public class CustomerUpdated extends BaseCustomer implements DomainEvent {
	
	public CustomerUpdated(Integer customerId, String name) {
		super(customerId, name);
	}
	
	public CustomerUpdated() {
		super();
	}

}
