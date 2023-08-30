package com.nareshit.ticketbooking.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.ticketbooking.dao.TicketDao;
import com.nareshit.ticketbooking.model.Ticket;

@Service
public class TicketService {

	@Autowired
	private TicketDao ticketDao; 
	
	public Ticket createTicket(Ticket ticketObj) {
		return ticketDao.save(ticketObj);	//insert operation
	}
	
	public Iterable<Ticket> getAllTickets(){ 
		return ticketDao.findAll(); 		//returns 
	}
	
	public Ticket getTicket(Integer ticketId) {
		return ticketDao.findById(ticketId).orElse(new Ticket(null,null,null,null));
	}
	
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket dbObj=getTicket(ticketId);
		dbObj.setEmail(newEmail);
		return ticketDao.save(dbObj);
	}
	
	public void deleteTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
	}
	
	public Ticket findByPassengerName(String passengerName) {
		return ticketDao.findbyPassengerName(passengerName);
	}
}
