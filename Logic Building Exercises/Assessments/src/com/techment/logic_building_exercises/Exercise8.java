package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise8 {

	static int armstrong(int n) {
		int sum = 0;
		while(n != 0) {
			int digit = n%10;
			int cube = digit * digit * digit;
			sum = sum + cube;
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check if it is Armstrong number: ");
		int num = sc.nextInt();
		if(armstrong(num) == num) {
			System.out.println(num + " is an Armstrong Number");
		}else{
			System.out.println(num + " is not an Armstrong Number.");
		}
		sc.close();
	}

}
