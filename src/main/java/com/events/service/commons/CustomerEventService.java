package com.events.service.commons;

import com.commons.events.customer.CustomerCreated;
import com.commons.events.customer.CustomerUpdated;

public interface CustomerEventService {

	void customerCreated(CustomerCreated customerCreated);

	void customerUpdated(CustomerUpdated customerUpdated);
	
}
