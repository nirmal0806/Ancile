package com.nareshit.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;

import com.nareshit.ticketbooking.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket,Integer> {
	
	/* 
	 Derived Query===>Developer writes abstract method based on framework rules
	 */

	public Ticket findbyPassengerName(String passengerName);
}
 