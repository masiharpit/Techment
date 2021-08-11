package com.techment.ExceptionHandling;

class AgeException extends RuntimeException
{
	String msg;
	
	public AgeException(String msg) {
		this.msg = msg;
	}
}

class IDNotFounfException extends Exception
{
	void IDNotFoundException()
	{
		System.out.println("ID Not Found.");
	}
}
public class CustomizedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw new AgeException("Age is not valid to apply for the loan.");
	}

}
