package com.techment.logic_building_exercises;

public class Exercise37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=1;i<=num;i++) {  
			for(int j=num-i;j>=1;j--)  
				System.out.print(" ");
				
			int j;
			for(j=i;j>=1;j--)
				System.out.print(j);
			
			for(int k=2;k<=i;k++)
				System.out.print(k);
			
			System.out.println();
		}
		for(int i=1;i<=num;i++) {  
			for(int j=1;j<=i;j++)  
				System.out.print(" ");
				
			int j;
			for(j=num-i;j>=1;j--)
				System.out.print(j);
			
			for(int k=2;k<=num-i;k++)
				System.out.print(k);
			
			System.out.println();
		}
	}

}
