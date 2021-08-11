package com.techment.logic_building_exercises;

public class Exercise34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=n;i>0;i--) {
			for(int j=n;j>=n-i;j--) {
				System.out.print(j);  
			}
			System.out.println(); 
		}
	}

}
