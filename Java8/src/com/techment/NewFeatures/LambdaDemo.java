package com.techment.NewFeatures;

interface Bank1
{
	void display();
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 bank = () -> System.out.println("This is display method");
		bank.display();
		
		Bank1 bank1 = () -> {
			System.out.println("This is a display method.");
			System.out.println("This is a multi-line body");
		};
		bank1.display();
	}

}
