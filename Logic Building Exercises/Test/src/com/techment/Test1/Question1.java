package com.techment.Test1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size for the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter the "+i+"th element: ");
			arr[i] = scanner.nextInt();
		}
		int children = 0;
		int adult = 0;
		int seniorCitizen = 0;
		for(int j=0; j<size; j++)
		{
			if(arr[j]<18)
			{
				children++;
			}else if(arr[j] >= 18 && arr[j]<=54)
			{
				adult++;
			}else
			{
				seniorCitizen++;
			}
		}
		System.out.println("Children: "+children);
		System.out.println("Adult: "+adult);
		System.out.println("Senior Citizen: "+seniorCitizen);
		scanner.close();
	}

}
