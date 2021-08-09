package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
int userEnteredPin,count=0,correctPin=12345;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the pin "); 
		userEnteredPin=scanner.nextInt();
		
		while(count!=2) { 
		if(userEnteredPin == correctPin) {
			System.out.println("Accepted");
			break;
			}
		else {
			System.out.println("Incorrect pin, Enter pin again");
			userEnteredPin=scanner.nextInt();  
			count++;
			}
		}
		if(count>2) 
			System.out.println("Account Locked");
		scanner.close();
	}
}
