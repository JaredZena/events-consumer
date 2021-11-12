package com.events.consumer;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.eventuate.tram.events.subscriber.DomainEventEnvelope;
import io.eventuate.tram.events.subscriber.DomainEventHandlers;
import io.eventuate.tram.events.subscriber.DomainEventHandlersBuilder;
import lombok.extern.slf4j.Slf4j;

import com.commons.events.customer.CustomerCreated;
import com.commons.events.customer.CustomerUpdated;
import com.events.service.commons.CustomerEventService;

@Singleton
@Slf4j
public class CustomerEventHandler {

	@Inject
	private CustomerEventService customerService;

	public CustomerEventHandler(CustomerEventService customerService) {
		this.customerService = customerService;
	}

	public DomainEventHandlers domainEventHandlers() {
		return DomainEventHandlersBuilder
				.forAggregateType("com.customerapi.service.model.entities.Customer")
				.onEvent(CustomerCreated.class, t -> {
					try {
						handleCustomerCreated(t);
					} catch (Exception e) {
						log.error(e.getMessage());
					}
				}).onEvent(CustomerUpdated.class, t -> {
					try {
						handleCustomerUpdate(t);
					} catch (Exception e) {
						log.error(e.getMessage());
					}
				}).build();
	}

	public void handleCustomerCreated(DomainEventEnvelope<CustomerCreated> customerCreated) {

		log.info("CustomerCreated Event.");
		if (customerCreated != null && customerCreated.getEvent() != null && customerCreated.getEvent().getCustomerId() != null) {
			customerService.customerCreated(customerCreated.getEvent());
		}

	}

	public void handleCustomerUpdate(DomainEventEnvelope<CustomerUpdated> customerUpdated) {
		log.info("CustomerUpdated Event.");

		if (customerUpdated != null && customerUpdated.getEvent() != null && customerUpdated.getEvent().getCustomerId() != null) {
			customerService.customerUpdated(customerUpdated.getEvent());
		}
	}

}
