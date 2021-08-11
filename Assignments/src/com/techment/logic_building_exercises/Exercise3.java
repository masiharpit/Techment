package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the weight of the 1st Horse: ");
		int weight1 = sc.nextInt();
		System.out.println("Enter the weight of the 2nd Horse: ");
		int weight2 = sc.nextInt();
		System.out.println("Enter the weight of the 3rd Horse: ");
		int weight3 = sc.nextInt();
		
		if(weight1 > weight2 && weight2 > weight3) {
			System.out.println("Horse 1 has more weight.");
		}else if(weight2 > weight3 && weight2 > weight1) {
			System.out.println("Horse 2 has more weight.");
		}else {
			System.out.println("Horse 3 has more weight.");
		}
		sc.close();

	}

}
