package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise10 {

	static boolean isPrime(int n) {
		for(int i = 2; i<n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 2; i<= n; i++) {
			if(isPrime(i)) {
				System.out.println(i+ " is a Prime number");
			}
		}
		sc.close();
	}

}
