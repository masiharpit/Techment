package com.techment.ArrayFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		System.out.println("Enter 10 integer values: ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int j=0; j<10; j++) {
			System.out.print(j + " ");
		}
		sc.close();
	}	

}
