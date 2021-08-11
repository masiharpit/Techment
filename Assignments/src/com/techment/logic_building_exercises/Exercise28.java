package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin = 1234;
		Scanner sc = new Scanner(System.in);
		
		int enter_pin;
		do
		{
			System.out.println("Enter your PIN: ");
			enter_pin = sc.nextInt();
			if(enter_pin == pin) {
				System.out.println("PIN is correct");
			}else {
				System.out.println("PIN is incorrect.");
			}
		}while(enter_pin != pin);
		sc.close();
	}

}
