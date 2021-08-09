package com.techment.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try
		{
			System.out.println("Enter any two numbers: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println("Remainder is: "+num1/num2);
		}catch(ArithmeticException ae) {
			System.out.println("Do not give zero...");
		}catch(NumberFormatException nme)
		{
			System.out.println("Do not give character only integers are allowed...");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Do not enter characters enter only numbers.");
		}catch(Exception e)
		{
			System.out.println(e.getClass());
		}
		scanner.close();
		
	}

}
