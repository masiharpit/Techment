package com.techment.logic_building_exercises;

public class Exercise36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {  
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
				
			}
			int count=0;  
			for(int j=n-i+1;j>=1;j--) {
				
				if(j==5) {  
					System.out.print(j);
					continue;
				}
				else if(count==0 && i!=1) {  
					System.out.print(" ");
					count++;
				}
				System.out.print(j); 
			}
			System.out.println();
		}
	}

}
