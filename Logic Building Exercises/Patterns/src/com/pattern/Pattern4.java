package com.pattern;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1; i<=3; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println("");
		}
	}

}
