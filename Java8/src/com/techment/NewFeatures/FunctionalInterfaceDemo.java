package com.techment.NewFeatures;



@FunctionalInterface
interface Bank
{
	void rateOfInterest();
	
	default void display()
	{
		System.out.println("This is a default method.");
	}
	
	default void show()
	{
		System.out.println("This is a show method");
	}
	static void loan()
	{
		System.out.println("You can apply for loan");
	}
	
	static void homeLoan()
	{
		System.out.println("You can apply for Home Loan");
	}
}
public class FunctionalInterfaceDemo {
	
}
