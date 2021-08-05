package practise_exercises;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter the operation want to be performed (+ - * /): ");
		char c = sc.next().charAt(0);
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		switch(c) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Enter the valid arithmetic operation.");
			break;
		}
		sc.close();
	}

}
