package com.encapsulation;

public class LoanApplication {
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outstandingBalance;

	public LoanApplication(String customerName, double loanAmount, double interestRate, int loanTerm,
			double outstandingBalance) {
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanTerm = loanTerm;
		this.outstandingBalance = outstandingBalance;
	}

	public void display() {
 System.out.println("loan application submitted");
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public double outstandingBalance() {
		return outstandingBalance;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public void setoutstandingBalance(double outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}

	public void makePayment(double loanAmount) {
		if (loanAmount <= 0) {
			System.out.println("invalid");
		} else if(outstandingBalance>loanAmount) {
			System.out.println("payement exceeds loan balance");
		}
		else {
			outstandingBalance-=loanAmount;
		}
	}
	public double calculateEmi() {
		double monthlyInterestRate = interestRate / 12 / 100;
	 return (loanAmount*interestRate*Math.pow((1+interestRate),10))/(Math.pow((1+interestRate),10)-1);
}
public void displayLoanDetailes()
{
	System.out.println("total loan:"+loanAmount);
	System.out.println("intreset rate:"+interestRate);
	System.out.println("emi:"+calculateEmi());
	System.out.println("reamining balance:"+outstandingBalance);
}
public String toString(String customerName,double loanAmount, double interestRate, int loanTerm,double outstandingBalance) {
	return "customer name:"+customerName+"loan amount:"+loanAmount+"interestRate:"+interestRate+"loanTerm:"+loanTerm+"outstandingBalance:"+outstandingBalance;
}
public static void main(String[] args) {
	LoanApplication l=new LoanApplication("ravi",10000.0,2.0,1000,9000.0);
	l.displayLoanDetailes();
	l.makePayment(1000);
	l.calculateEmi();
	
}
}

