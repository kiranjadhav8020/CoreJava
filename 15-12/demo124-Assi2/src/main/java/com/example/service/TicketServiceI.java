package com.example.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.entity.Ticket;
import com.example.entity.User;
import com.example.model.FromToPlace;

@Service
public interface TicketServiceI {
	
	
		
		public Ticket bookTicket(Ticket ticket) ;
		
		public List<Ticket> getTicket();
		
		public int cancleTicket(int id);
		
		public List<Ticket> findByFromplaceAndToplace(String f, String t);
		
		public List<Ticket> findByFromplaceContainsAndToplaceContainsAllIgnoreCase(String fromPart, String toPart);
		
		public List<Ticket> met();
	
		
		public List<Ticket> met1(String toplace);
		
		public List<Ticket> met2(String toplace);
		
		public List<Ticket> met3(String toplace);
		
		public List<Ticket> findAllTravels();
		/*
		public List<Ticket> findAbc2();
		*/

		public User bookTicket( User ticket);

}
