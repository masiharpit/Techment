package com.techment.NewFeatures;


interface Calculation1
{
	void display();
}

class Hello
{
	void message()
	{
		System.out.println("Today is Holiday");
	}
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculation1 calculation = () -> System.out.println("This is a message.");
//		calculation.display();
		
		Hello hello = new Hello();
		Calculation1 calculation2 = hello::message;
		calculation2.display();
	}

}
