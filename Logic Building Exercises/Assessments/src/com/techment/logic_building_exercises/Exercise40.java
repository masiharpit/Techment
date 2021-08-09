package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        System.out.print("Enter number of rows (m): ");
	        int m = in.nextInt();
	        System.out.print("Enter number of columns (n): ");
	        int n = in.nextInt();
	        
	        int arr[][] = new int[m][n];
	        int newArr[][] = new int[m][n];
	        
	        System.out.println("Enter array elements");
	        for (int i = 0; i < m; i++) {
	            System.out.println("Enter Row "+ (i+1) + " :");
	            for (int j = 0; j < n; j++) {
	                arr[i][j] = in.nextInt();
	            }
	        }
	        
	        System.out.println("Input Array:");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(arr[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        
	        for (int j = 0; j < n; j++) {
	            for (int i = 0; i < m; i++) {
	                newArr[i][n - 1 - j] = arr[i][j]; 
	            }
	        }
	        
	        System.out.println("Mirror Image Array:");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(newArr[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        in.close();
	}

}
