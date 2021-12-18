package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket_User")
public class Ticket {
	
	@Id
	@GeneratedValue
	public int ticketid;
	public String travelsname;
	public String fromplace;	
	public String toplace;
	
	public Ticket() {}
	
	public Ticket(int ticketid, String travelsname, String fromplace, String toplace) {
		super();
		this.ticketid = ticketid;
		this.travelsname = travelsname;
		this.fromplace = fromplace;
		toplace = toplace;
	}
	
	
	
	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public String getTravelsname() {
		return travelsname;
	}

	public void setTravelsname(String travelsname) {
		this.travelsname = travelsname;
	}

	public String getFromplace() {
		return fromplace;
	}

	public void setFromplace(String fromplace) {
		this.fromplace = fromplace;
	}

	public String getToplace() {
		return toplace;
	}

	public void setToplace(String toplace) {
		this.toplace = toplace;
	}

	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", travelsname=" + travelsname + ", fromplace=" + fromplace + ", toplace="
				+ toplace + "]";
	}
	
	

}
