package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		if((side1 * side1)+(side2*side2) == side3*side3) {
			System.out.println("Is a Right Angled Trianlge.");
		}else if((side1 * side1)+(side3*side3) == side2*side2) {
			System.out.println("Is a Right Angled Triangle.");
		}else if((side3 * side3)+(side2*side2) == side1*side1) {
			System.out.println("Is a Right Angled Triangle.");
		}else {
			System.out.println("Is not a Right Angled Triangle.");
		}
		sc.close();
	}

}
