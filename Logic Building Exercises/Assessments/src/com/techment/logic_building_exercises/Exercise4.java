package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
			System.out.println("It's a Leap Year");
		}else {
			System.out.println("It's not a Leap Year");
		}
		sc.close();
	}

}
