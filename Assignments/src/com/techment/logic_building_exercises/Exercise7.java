package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		for(int i=r1; i<= r2; i++) {
			System.out.print(i+ " ");
		}
		sc.close();
	}

}
