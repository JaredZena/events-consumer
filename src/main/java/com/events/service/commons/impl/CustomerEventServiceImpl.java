package com.events.service.commons.impl;

import javax.inject.Singleton;

import lombok.extern.slf4j.Slf4j;

import com.commons.events.customer.CustomerCreated;
import com.commons.events.customer.CustomerUpdated;
import com.events.service.commons.CustomerEventService;

@Singleton
@Slf4j
public class CustomerEventServiceImpl implements CustomerEventService {

	@Override
	public void customerCreated(CustomerCreated customerCreated) {

		log.info("CustomerCreated Event.");

	}

	@Override
	public void customerUpdated(CustomerUpdated customerUpdated) {

		log.info("CustomerUpdated Event...");

	}

}
