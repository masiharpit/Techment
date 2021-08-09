package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date: ");
		int date = sc.nextInt();
		if(date>=1 && date <= 31) {
			if(date%2==0) {
				System.out.println("Even numbered car.");
			}else {
				System.out.println("Odd numbered car.");
			}
		}
		sc.close();
	}

}
