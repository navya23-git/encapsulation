package com.encapsulation;

public class CreditCardSystem {
	private String customerName;
	private double creditLimit;
	private double currentDebt;
	private double interestRate;
public CreditCardSystem(String customerName, double creditLimit,double currentDebt,double interestRate) {
	this.customerName=customerName;
	this.creditLimit=creditLimit;
	this.currentDebt=currentDebt;
	this.interestRate=interestRate;
}
public String getcustomerName() {
	return customerName;
	
}
public double  getcreditLimit() {
	return creditLimit;
}
public double getcurrentDebt() {
	return currentDebt;
}
public double getinterestRate() {
	return interestRate;
}
public void setcustomerName() {
	this.customerName=customerName;
}
public void setcreditLimit() {
	this.creditLimit=creditLimit;
}
public void setCurrentDebt() {
	this.creditLimit=creditLimit;
}
public void setInterestRate() {
	this.interestRate=interestRate;
}
public void swipeCard(double amount) {
	if(amount==creditLimit) {
		System.out.println("Transaction declined linit exceeded");
	}
	else {
		currentDebt=amount+currentDebt;
		System.out.println("account taken :"+amount);
		System.out.println("current debit:"+currentDebt);
	}
}
public void makePayment(double amount) {
	if(amount>currentDebt) {
	System.out.println("excess payement not allowed");	
	}
	else {
		currentDebt=currentDebt-amount;
		System.out.println("paid amount :"+amount);
		System.out.println("current debit:"+currentDebt);
	}
}
public void applyIntrest() {
	currentDebt=currentDebt+(currentDebt*(interestRate/100));
	System.out.println("current debt with intrest is:"+currentDebt);
}
public String toString() {
	return "customerName:"+customerName+"\n creditLimit:"+creditLimit+"\ncurrentDebt:"+currentDebt+"\ninterestRate:"+interestRate;
}

public static void main(String args[]) {
	CreditCardSystem c=new CreditCardSystem("jerry",1000.0,500,0.2);
	System.out.println(c);
	c.swipeCard(1000);
	c.makePayment(500.0);
	c.applyIntrest();
}
}
