package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Info1")
public class User {
	
	@OneToOne(cascade = CascadeType.ALL)
	private Ticket ticket;
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String emailid;
	
	private String contactno;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	


	public User(int id, String name, String emailid, String contactno) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.contactno = contactno;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailid=" + emailid + ", contactno=" + contactno + "]";
	}
	
	
	
	

}
