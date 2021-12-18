package com.javasampleapproach.springrest.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.javasampleapproach.springrest.mysql.model.Customer;
import com.javasampleapproach.springrest.mysql.repo.CustomerRepository;

@Service
public class CustomerService2 {
	@Autowired
	CustomerRepository repository;
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRES_NEW)
	//You may also check behavior with Propogation.REQUIRED, MANDATORY, NOT_SUPPORTED, NEVER
	public Customer internalMethod1(Customer customer)
	{
		Customer _customer = repository.save(new Customer(customer.getName()+"1111", customer.getAge(), customer.isActive()));
		//since new transaction is started, above record gets saved as no exceptions are thrown here
		
		if(false) {
			
			throw new RuntimeException("Inner exception in throwing intentionally");
			}
		
		return _customer;
	}
}
