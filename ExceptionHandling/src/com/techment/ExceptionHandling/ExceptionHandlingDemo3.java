package com.techment.ExceptionHandling;

import java.io.FileNotFoundException;

class Student
{
	void checkEligibility(int age) throws FileNotFoundException
	{
		if(age>18)
		{
			System.out.println("You are eligible for loan.");
		}else
		{
			throw new FileNotFoundException("You cannot apply for loan.");
		}
	}
}
public class ExceptionHandlingDemo3 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Student student = new Student();
		student.checkEligibility(3);
	}

}
