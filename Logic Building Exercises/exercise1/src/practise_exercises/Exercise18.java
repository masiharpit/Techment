package practise_exercises;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = 0;
		try {
			res = num1 / num2;
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getClass());
		}finally{
			System.out.println(res);
			System.out.println("Operation has been done successfully.");
		}
		sc.close();
	}

}
