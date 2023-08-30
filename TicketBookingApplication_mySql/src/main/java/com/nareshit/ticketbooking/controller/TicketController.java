package com.nareshit.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.ticketbooking.model.Ticket;
import com.nareshit.ticketbooking.serivce.TicketService;

@RestController
@RequestMapping(value="/tickets")
// TicketController obj=ioc.getTicketController();
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	@GetMapping(value="/all") //obj.getAllTickets();
	//Jackson library converts Iterable<Ticket> into a JSON object
	public Iterable<Ticket> getAllTickets(){
		return ticketService.getAllTickets();
	}
	
//	@GetMapping(value="/{ticketId}")
//	public Ticket getTicket(@PathVariable("ticketId") Integer ticketId) {
//		//PathVariable reads parameters in the URL and assigns it to a Java variable
//			return ticketService.getTicket(ticketId);
//	}
	@GetMapping(value="/{passengerName}")
	public Ticket getTicket(@PathVariable("passengerName") String  passengerName) {
		//PathVariable reads parameters in the URL and assigns it to a Java variable
			return ticketService.findByPassengerName(passengerName);
	}
	
	
	@PostMapping(value="/create")
	public Ticket createTicket(@RequestBody Ticket ticketInput) {
		return ticketService.createTicket(ticketInput);
	}
	
	@PutMapping(value="/{ticketId}/{newEmail}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId, 
			@PathVariable("newEmail") String newEmail){
		return ticketService.updateTicket(ticketId, newEmail);
	}
	
	@DeleteMapping(value="/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		 ticketService.deleteTicket(ticketId);
	}
	
}
  