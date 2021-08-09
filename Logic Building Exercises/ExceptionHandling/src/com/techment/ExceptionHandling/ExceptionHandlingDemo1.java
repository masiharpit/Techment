package com.techment.ExceptionHandling;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name is Arpit");
		System.out.println("Email arpitmasih77");
		try {
			System.out.println(1/0);
		}catch(ArithmeticException ae){
			System.out.println("Divide by zero error.");
		}
		System.out.println("Contact 9629354715");
	}

}
