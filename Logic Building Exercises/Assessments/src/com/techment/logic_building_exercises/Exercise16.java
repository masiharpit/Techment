package com.techment.logic_building_exercises;
import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		if(price % 8 ==0 && price % 3 == 0) {
			System.out.println("The product can be purchasable.");
		}else {
			System.out.println("The product cannot be purchased.");
		}
		sc.close();
	}

}
