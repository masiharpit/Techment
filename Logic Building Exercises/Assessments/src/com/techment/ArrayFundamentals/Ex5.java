package com.techment.ArrayFundamentals;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 9 elements for the 1st array: ");
		for(int i=0;i<3;i++) {
			for(int j=0; j<3; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the 9 elements for the second array: ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		int arr3[][] = new int[3][3];
		System.out.println("Addition of two arrays: ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println("");
		}
		sc.close();
	}
}
