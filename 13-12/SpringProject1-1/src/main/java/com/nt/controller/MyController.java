package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.Ticket;
import com.nt.service.TicketServiceI;

@RestController
public class MyController {

	@Autowired
TicketServiceI ticketSerI;
	
	public MyController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@PostMapping("/bookTicket")
	Ticket bookTicket1(@RequestBody Ticket ticket) {
		System.out.println("bookTicket method");
		return ticketSerI.bookTicket(ticket);
		
	}
	
	@GetMapping("/getTicket") 
	public ResponseEntity<Ticket> getTacket() {
		
		 List<Ticket> list = ticketSerI.getTicket();
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
	@DeleteMapping("/cancleTicket/{id}")
	public ResponseEntity<String> calcleTicket(@PathVariable("id") int id) {
		//System.out.println("Delete Customer Whith this ID ="+ id);
		int i = ticketSerI.cancleTicket(id);
		return new ResponseEntity("This Ticket Is Deleted With ID ="+i+" !!",HttpStatus.OK);
		
	}
	
	

}
