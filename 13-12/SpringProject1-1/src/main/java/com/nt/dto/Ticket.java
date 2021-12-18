package com.nt.dto;

import org.springframework.stereotype.Component;

@Component
public class Ticket{
	
	public int id;
	public String travels_Name;
	public String from,to;
	
	public void setId(int id) {
		this.id=id;
	}
	
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Ticket(int id, String travels_Name, String from, String to) {
		super();
		this.id = id;
		this.travels_Name = travels_Name;
		this.from = from;
		this.to = to;
	}


	public String getTravels_Name() {
		return travels_Name;
	}


	public void setTravels_Name(String travels_Name) {
		this.travels_Name = travels_Name;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public int getId() {
		return id;
	}
	
	
	
	
}

