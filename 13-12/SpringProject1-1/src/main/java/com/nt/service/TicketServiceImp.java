package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nt.dto.Ticket;

@Component
public class TicketServiceImp implements TicketServiceI{
	
	List <Ticket> addTicket;
	
	TicketServiceImp(){
		addTicket=new ArrayList<>();
		addTicket.add(new Ticket(101,"Godavari","Dhoki","Hadapsar"));
		addTicket.add(new Ticket(102,"Ganaga","Murud","Shivaji Nagar"));
		addTicket.add(new Ticket(103,"Gouri","LAtur","Bhosri"));
	}
	
	

	@Override
	public Ticket bookTicket(Ticket ticket) {
		
		addTicket.add(ticket);
	
		return ticket;
	}

	@Override
	public List<Ticket> getTicket() {
		return addTicket;
	}

	@Override
	public int cancleTicket(int id) {
		// TODO Auto-generated method stub
		
		for(Ticket tckt :addTicket) {			
			if(tckt.getId()==id) {
				addTicket.remove(tckt);
			}
			
		}
		
		return id;
	}

}
