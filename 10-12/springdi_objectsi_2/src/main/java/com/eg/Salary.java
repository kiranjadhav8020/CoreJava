package com.eg;
public class Salary {



private int pfAmount;
private int salaryAmount;
public int getPfAmount() {
return pfAmount;
}
public void setPfAmount(int pfAmount) {
this.pfAmount = pfAmount;
}
public int getSalaryAmount() {
return salaryAmount;
}
public void setSalaryAmount(int salaryAmount) {
this.salaryAmount = salaryAmount;
}
public Salary(int pfAmount, int salaryAmount) {
super();
this.pfAmount = pfAmount;
this.salaryAmount = salaryAmount;
}

public Salary() {
System.out.println("Salary def cons");
}
@Override
public String toString() {
return "Salary [pfAmount=" + pfAmount + ", salaryAmount=" + salaryAmount + "]";
}



}