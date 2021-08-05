package com.techment.logic_building_exercises;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int table_of = sc.nextInt();
		int limit = sc.nextInt();
		for(int i=1; i<=limit; i++) {
			System.out.println(table_of +" X "+ i+" = "+table_of*i);
		}
	}

}
