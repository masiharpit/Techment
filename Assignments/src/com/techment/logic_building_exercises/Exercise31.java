package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table of number want to print: ");
		int table_of = sc.nextInt();
		System.out.println("Enter the table limit: ");
		int limit = sc.nextInt();
		for(int i=1; i<=limit; i++) {
			System.out.println(table_of +" X "+ i+" = "+table_of*i);
		}
		sc.close();
	}

}
