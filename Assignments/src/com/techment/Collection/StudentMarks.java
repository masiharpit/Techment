package com.techment.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> marks= new ArrayList<Integer>();
		System.out.println("Enter number of Students: ");
		int size = scanner.nextInt();
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter the marks of student "+(i+1));
			marks.add(scanner.nextInt());
		}
		int total = 0;
		int highestMark = 0;
		for(Integer mark : marks)
		{
			if(mark > highestMark)
			{
				highestMark = mark;
			}
			total = total + mark;
		}
		System.out.println("\nHighest Marks: "+ highestMark);
		System.out.println("Average Marks: "+ (total/size));
		System.out.print("Marks: ");
		for(int i = 0; i<size; i++)
		{
			System.out.print((i+1)+"-"+ marks.get(i)+ " ");
		}
		System.out.println("\n3rd Student Marks: "+marks.get(2));
		Collections.sort(marks);
		System.out.print("Sorted: ");
		for(int i = 0; i<size; i++)
		{
			System.out.print((i+1)+"-"+ marks.get(i)+ " ");
		}
		scanner.close();
	}

}
