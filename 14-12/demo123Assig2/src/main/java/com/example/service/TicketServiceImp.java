package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Ticket;
import com.example.repository.TicketRepository;

@Service
public class TicketServiceImp implements TicketServiceI{
	
	@Autowired
	TicketRepository repo;

	@Override
	public Ticket bookTicket(Ticket ticket) {
		System.out.println("service impl");
		Ticket save = repo.save(ticket);
	
		return save;
	}

	@Override
	public List<Ticket> getTicket() {
		return null;
	}

	@Override
	public int cancleTicket(int id) {
		// TODO Auto-generated method stub
		
		
		
		return id;
	}

	@Override
	public List<Ticket> findByFromplaceAndToplace(String f, String t) {
		// TODO Auto-generated method stub
		List<Ticket> list = repo.findByFromplaceAndToplace(f, t);
		return list;
	}

	@Override
	public List<Ticket> findByFromplaceContainsAndToplaceContainsAllIgnoreCase(String fromPart, String toPart) {
		List<Ticket> findall = repo.findByFromplaceContainsAndToplaceContainsAllIgnoreCase(fromPart, toPart);
		return findall;
	}
	
	@Override
	public List<Ticket> met() {
		// TODO Auto-generated method stub
		List<Ticket> all=repo.met();
		return all;
	}

	
	@Override
	public List<Ticket> met1(String toplace) {
		// TODO Auto-generated method stub
		List<Ticket> all=repo.met1(toplace);
		return all;
	}
	
	@Override
	public List<Ticket> met2(String toplace) {
		// TODO Auto-generated method stub
		List<Ticket> all=repo.met2(toplace);
		return all;
	}
	
	@Override
	public List<Ticket> met3(String toplace) {
		// TODO Auto-generated method stub
		//List<Ticket> list = repo.findAll();
		List<Ticket> all=repo.met3(toplace);
		return all;
	}
	
	@Override
	public List<Ticket> findAllTravels() {
		// TODO Auto-generated method stub
		List<Ticket> list = repo.findAll();

		
		//List<Object[]> allTravels = repo.findAllTravels();
		/*
		repo.findAllTravels().forEach((arr)->{
			for(Object obj: arr) {
				System.out.println((String)obj);
			}
		});
	*/
		System.out.println("3=========================================");
		return list;
	}
	/*
	@Override
	public List<Ticket> findAbc2() {
		// TODO Auto-generated method stub
		
		List<Ticket> list = repo.findAll();
		
		 repo.findAbc2().forEach((arr)->{
			 for(Object obj: arr) {
				 System.out.println((String)obj);
			 }
		 });
		
		return list;
	}
*/

}
