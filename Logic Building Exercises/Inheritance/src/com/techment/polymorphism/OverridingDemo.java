package com.techment.polymorphism;


class Bank{
	public void rateOfInterest() {
		System.out.println("3 %");
	}
	public void openAccount() {
		System.out.println("Open account.");
	}
}

class SBI extends Bank{
	public void rateOfInterest() {
		System.out.println("5 %");
	}
	public void applyLoan()
	{
		System.out.println("You can apply for loan.");
	}
}

class Axis extends Bank{
	public void rateOfInterest() {
		System.out.println("6 %");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		sbi.rateOfInterest();
		sbi.applyLoan();
		
		Bank bank1 = new SBI();
		bank1.rateOfInterest();
		bank1.openAccount();
		
		Bank bank2 = new Axis();
		bank2.rateOfInterest();
		bank2.openAccount();
	}

}
