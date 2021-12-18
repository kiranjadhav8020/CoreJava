package com.eg;

public class Employee {
private int id;
private String name;
private Address address;//Aggregation
private Salary salary;

public Employee() {System.out.println("Employee def cons");}

public Employee(int id, String name, Address address,Salary salary) {
super();
this.id = id;
this.name = name;
this.address = address;
this.salary=salary;
System.out.println("Employee(int id, String name, Address address)");
}



public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
System.out.println("setting id");
}

public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
System.out.println("setting address");
}



public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
System.out.println("setting name");
}



public Salary getSalary() {
return salary;
}



public void setSalary(Salary salary) {
this.salary = salary;
}



void show(){
System.out.println(id+" "+name);
System.out.println(address.toString());
System.out.println(salary.toString());
}



public void displayInfo(){
System.out.println(id+" "+name);
System.out.println(address);
System.out.println(salary);
}

}