package com.techment.Test2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n =0;
		
		do
		 {
			System.out.println("Press the option:\n1 -> Red Light\t2 -> Yellow Light\t3 -> Green Light\t0 -> Terminate");
			n = scanner.nextInt();
			 switch(n)
			 {
			 case 0:
				 n = 0;
				 System.out.println("Traffic Light not Working");
				 break;
			 case 1: 
				 System.out.println("Stop");
				 break;
			 case 2: 
				 System.out.println("Ready");
				 break;
			 case 3: 
				 System.out.println("Go");
				 break;
			 default:
				 System.out.println("Please enter the valid color option");
				 break;
			 }
		 }while(n!=0);
		scanner.close();
	}
	

}
