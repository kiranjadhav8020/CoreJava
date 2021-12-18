package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class FromToPlace {
	
	private String fromeplace;
	private String toplace;
	
	public FromToPlace() {
		// TODO Auto-generated constructor stub
	}
	
	

	public FromToPlace(String fromeplace, String toplace) {
		super();
		this.fromeplace = fromeplace;
		this.toplace = toplace;
	}



	public String getFromeplace() {
		return fromeplace;
	}

	public void setFromeplace(String fromeplace) {
		this.fromeplace = fromeplace;
	}

	public String getToplace() {
		return toplace;
	}

	public void setToplace(String toplace) {
		this.toplace = toplace;
	}



	@Override
	public String toString() {
		return "FromToPlace [fromeplace=" + fromeplace + ", toplace=" + toplace + "]";
	}
	

}
