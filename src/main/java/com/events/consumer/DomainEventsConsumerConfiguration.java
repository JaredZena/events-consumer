package com.events.consumer;

import javax.inject.Singleton;

import io.eventuate.tram.events.subscriber.DomainEventDispatcher;
import io.eventuate.tram.events.subscriber.DomainEventDispatcherFactory;

@Singleton
public class DomainEventsConsumerConfiguration {

	@Singleton
	public DomainEventDispatcher customerDomainEventDispatcher(CustomerEventHandler customerEventHanlder,
			DomainEventDispatcherFactory domainEventDispatcherFactory) {
		return domainEventDispatcherFactory.make("customerEventDispatchName", customerEventHanlder.domainEventHandlers());
	}

}
