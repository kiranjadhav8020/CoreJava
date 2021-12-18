package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Ticket;
import com.example.service.TicketServiceI;

@RestController
public class MyController {

	@Autowired
TicketServiceI ticketSerI;
	
	public MyController() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 *  {
    "ticketid": 3,
    "travelsname": null,
    "fromplace": null,
    "toplace": null
}
	*/
	@PostMapping("/bookTicket")
	Ticket bookTicket1(@Valid  @RequestBody Ticket ticket) {
		System.out.println("bookTicket method");
		return ticketSerI.bookTicket(ticket);
		
	}
	
	@GetMapping("/getTicket") 
	public ResponseEntity<Ticket> getTacket() {
		
		 List<Ticket> list = ticketSerI.getTicket();
		return new ResponseEntity(list,HttpStatus.OK);
	}
	//http://localhost:8585//cancleTicket/101
	@DeleteMapping("/cancleTicket/{id}")
	public ResponseEntity<String> calcleTicket(@PathVariable("id") int id) {
		//System.out.println("Delete Customer Whith this ID ="+ id);
		int i = ticketSerI.cancleTicket(id);
		return new ResponseEntity("This Ticket Is Deleted With ID ="+i+" !!",HttpStatus.OK);
		
	}
	//http://localhost:8585//getTicket/dhoki/pune
	@GetMapping("/getTicket/{from}/{to}") 
	public ResponseEntity findByFromplaceAndToplace(@PathVariable String from, @PathVariable String to) {
		// TODO Auto-generated method stub
		List<Ticket> list = ticketSerI.findByFromplaceAndToplace(from, to);
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
	//http://localhost:8585/getTicket1/dhoki/pune
		@GetMapping("/getTicket1/{from}/{to}") 
	public ResponseEntity findByFromplaceContainsAndToplaceContainsAllIgnoreCase(@PathVariable String from, @PathVariable String to) {
			List<Ticket> list = ticketSerI.findByFromplaceContainsAndToplaceContainsAllIgnoreCase( from,to);
			return new ResponseEntity(list,HttpStatus.OK);
		}
		
		
		//http://localhost:8585/getAll
		@GetMapping("/getAll")
		public ResponseEntity findAll() {
			List<Ticket> met = ticketSerI.met();
			return new ResponseEntity(met,HttpStatus.OK);
		}
		
		//http://localhost:8585/getTicket1/dhoki
		@GetMapping("/getToplace1/{toplace}")
		public ResponseEntity met1(@PathVariable String toplace) {
			List<Ticket> met = ticketSerI.met1(toplace);
			return new ResponseEntity(met,HttpStatus.OK);
		}
		
		//http://localhost:8585/getTicket2/dhoki
		@GetMapping("/getToplace2/{toplace}")
		public ResponseEntity met2(@PathVariable String toplace) {
			List<Ticket> met = ticketSerI.met2(toplace);
			return new ResponseEntity(met,HttpStatus.OK);
		}
		
		//http://localhost:8585/getTicket3/dhoki
		@GetMapping("/getToplace3/{toplace}")
		public ResponseEntity met3(@PathVariable String toplace) {
			List<Ticket> met = ticketSerI.met3(toplace);
			return new ResponseEntity(met,HttpStatus.OK);
		}
		
		//http://localhost:8585/findalltrivels/godavari
		@GetMapping("/findalltrivels")
		public ResponseEntity findAllTravels() {
			List<Ticket> met = ticketSerI.findAllTravels();
			return new ResponseEntity(met,HttpStatus.OK);
		}
		
}
