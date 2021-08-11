package com.techment.logic_building_exercises;
import java.util.Random;

public class Exercise27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int throw1 = random.nextInt(6);
		
		throw1++;
		System.out.println("Dice 1: "+throw1);
		int throw2 = random.nextInt(6);
		
		throw2++;
		System.out.println("Dice 2: "+ throw2);
		int points = 0;
		if(throw1%2 ==0 && throw2%2==0) {
			System.out.println("Both even number generated.");
			points = throw1+throw2;
		}else {
			System.out.println("Even number not generated.");
			if(throw1 > throw2) {
				points = throw2;
			}else {
				points = throw1;
			}
		}
		System.out.println("Your Points is: "+points);
	}

}
