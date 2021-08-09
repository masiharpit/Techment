package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int num = sc.nextInt();
		int lastDigit = num%10;
		int firstDigit = num/10;
		int doorNumber = firstDigit + lastDigit;
		System.out.println("The door number: "+doorNumber);
		sc.close();
	}

}
