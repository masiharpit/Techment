package com.techment.abstraction;


abstract class Bank{
	void eligibility() {
		System.out.println("Above 18 can open an account.");
	}
	
	abstract int rateOfInterest(int interestRate);
	
	
}

class Axis extends Bank{
	@Override
	int rateOfInterest(int interestRate) {
		System.out.println("Axis Bank");
		interestRate = 2 * interestRate;
		return interestRate;
	}
}

class Kotak extends Bank{
	@Override
	int rateOfInterest(int interestRate) {
		System.out.println("Kotak Bank ");
		return interestRate;
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Axis();
		System.out.println(bank.rateOfInterest(5));
		
		Bank bank1 = new Kotak();
		System.out.println(bank1.rateOfInterest(6));
	}

}
