package com.techment.logic_building_exercises;

import java.util.Scanner;
import java.util.Random;

public class Exercise26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		Random random = new Random();
		int random_number = random.nextInt(100);
		do
		{
			System.out.println("Enter any number between 1 to 100:");
			number = sc.nextInt();
			
			
				if(number == random_number) {
					System.out.println("You guessed it right.");
				}else {
					System.out.println("Your guess does not match the value.");
				}
		}while(number != random_number);

			sc.close();
	}

}
