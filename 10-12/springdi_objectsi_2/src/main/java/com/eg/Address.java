package com.eg;
public class Address { 
private String addressLine1;
private String city;  
private String state;  
private String country;  
  
public Address() {System.out.println("Address def cons");}  

public Address(String city, String state, String country) {  
    super();  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  

public String getAddressLine1() {  
    return addressLine1;  
}  
public void setAddressLine1(String addressLine1) {  
    this.addressLine1 = addressLine1;  
    System.out.println("setting addressLine1");
}

public String getCountry() {  
    return country;  
}  
public void setCountry(String country) {  
    this.country = country;  
    System.out.println("setting country");
}

public String getState() {  
    return state;  
}  
public void setState(String state) {  
    this.state = state;  
    System.out.println("setting state");
}

public String getCity() {  
    return city;  
}  
public void setCity(String city) {  
    this.city = city;  
    System.out.println("setting city");
}


public String toString(){  
    return city+" "+state+" "+country;  
}  
}
