package com.techment.logic_building_exercises;

public class Exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		for(int i=1; i<=num;i++){
			for(int j=1; j<=i-1;j++) { 
				System.out.print(" ");
			}
			for(int j=1; j<=num-i+1;j++) { 
					System.out.print(j);
			}
			for(int j=num-i; j>=1;j--) { 
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
