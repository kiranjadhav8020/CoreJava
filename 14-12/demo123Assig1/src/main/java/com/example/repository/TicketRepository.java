package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Ticket;
import com.example.model.FromToPlace;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{

	public Ticket save(Ticket ticket);
	
	List<Ticket> findByFromplaceAndToplace(String f, String t);
	
	List<Ticket> findByFromplaceContainsAndToplaceContainsAllIgnoreCase(String fromPart, String toPart);
	
	@Query("SELECT t FROM Ticket t")
	List<Ticket> met();
	
	
	
	@Query("SELECT t FROM Ticket t WHERE t.toplace= :toplace")
	List<Ticket> met1(@Param("toplace") String toplace);
	
	
	@Query("SELECT t FROM Ticket t WHERE t.toplace LIKE %:toplace%")
	List<Ticket> met2(@Param("toplace") String toplace);
	
	
	@Query("SELECT t FROM Ticket t WHERE t.toplace LIKE %?1%")
	List<Ticket> met3(@Param("toplace") String toplace);	
	
	
	//custome query (using native query)
	@Query(value= "select distinct t.travelsname from ticket1 t", nativeQuery=true)
	List<Object[]> findAllTravels();
	
	/*
	//custome query (using JPQL query)
	@Query(value="select new com.example.model.FromToPlace(t.fromplace)")
	List<FromToPlace> findAbc2();
	*/
}
