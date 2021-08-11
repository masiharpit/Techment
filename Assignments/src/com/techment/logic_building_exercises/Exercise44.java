package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s,area;
		System.out.println("Enter the 3 sides of a triangle as integer:");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt(); //  i/p from user
		int b=scanner.nextInt();
		int c=scanner.nextInt();

		s = (a+b+c) / 2;  
		area = Math.sqrt( s*(s-a)*(s-b)*(s-c) );  
		System.out.println("Area of Tringle is "+area);
		scanner.close();
	}

}
