import java.util.Scanner;
import java.util.Arrays;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many marks you want to enter: ");
		int number_of_marks = sc.nextInt();
		int[] marks = new int[number_of_marks];
		System.out.println("Enter the "+number_of_marks+" marks: ");
		for(int i=0; i<marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println("Marks obtained: ");
		for(int j=0; j<marks.length; j++) {
			System.out.println(marks[j]);
		}
		int sum_of_marks = 0;
		for(int k = 0; k<marks.length; k++) {
			sum_of_marks += marks[k];
			
		}
		System.out.println("Total marks obtained: "+sum_of_marks);
		
		Arrays.sort(marks);
		System.out.println("Maximun mark obtained: "+marks[marks.length-1]);
		System.out.println("Minimum mark obtained: "+marks[0]);
		System.out.println("Second Highest Marks: "+ marks[marks.length-2]);
		double avg = sum_of_marks / 5;
		if(avg < 40) {
			System.out.println("Result: Fail");
		}else {
			System.out.println("Result: Pass");
		}
		sc.close();
	}

}
