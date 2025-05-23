package com.encapsulation;

public class FixedDepositeAccount {
private String customerName;
private double principalAmount;
private int intresetRate;
private int duration;
private double maturityAmount ;
public FixedDepositeAccount(String customerName,double principalAmount,int intresetRtae,double maturityAmount,int duration){
	this.customerName=customerName;
	this.principalAmount=principalAmount;
	this.intresetRate= intresetRate;
	this.maturityAmount=maturityAmount;
	this.duration=duration;
}
public String getcustomerName(){
	return customerName;
}
public double getprincipalAmount()
{
	return principalAmount;
}
public int getintresetRate()
{
	return intresetRate;
	}
public double getmaturityAmount()
{
	return maturityAmount;
	}
public void setcustomerName(String customerName)
{
	this.customerName=customerName;
	}
public void setprincipalAmount(double principalAmount) {
	this.principalAmount=principalAmount;
}
public void setintresetRate(int intresetRate)
{
	this.intresetRate=intresetRate;
	}
public void setmaturityAmount(double maturityAmount) {
	this.maturityAmount=maturityAmount;
}
public double calculateMaturityAmount()
{
	return principalAmount * Math.pow(1 + ( intresetRate/ 100),duration );
	}
public void withdrawBeforeMaturity(int year) {
	if(year<=1) {
		System.out.println("cannot withdraw before one year");
	}
	else {
		double currentAmount=principalAmount*Math.pow(1+(intresetRate/100),duration);
		double penalty=currentAmount*0.03;
		double payOut=currentAmount-penalty;
		System.out.println("penalty:"+penalty);
		System.out.println("payout:"+payOut);
	}
}
public static void main(String args[]) {
	FixedDepositeAccount f=new FixedDepositeAccount("tom",1000.0,3,0.02,2);
	double maturity=f.calculateMaturityAmount();
	System.out.println(maturity);
	f.withdrawBeforeMaturity(1);
}

}
