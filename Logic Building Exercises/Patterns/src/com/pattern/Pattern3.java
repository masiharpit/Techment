package com.pattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5;j++) {
				if(i==1 || j==1 || i==5 || j==5 ) {
					System.out.print("*");
					continue;
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
