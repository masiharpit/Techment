package com.techment.logic_building_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentense: ");
	    String str=sc.nextLine();
	    
	    String words[]=str.split(" ");
	    Arrays.sort(words);
	    
	    for(int i=0;i<words.length;i++){
	    	System.out.println(words[i]);
	    }
	    sc.close();
	}

}
