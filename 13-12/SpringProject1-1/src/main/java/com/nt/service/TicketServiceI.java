package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.dto.Ticket;

@Service
public interface TicketServiceI {
	
	public Ticket bookTicket(Ticket ticket) ;
	
	public List<Ticket> getTicket();
	
	public int cancleTicket(int id);

}
