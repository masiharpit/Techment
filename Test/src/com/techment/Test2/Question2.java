package com.techment.Test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> greet = new HashMap<String, Integer>();
		greet.put("Hello", 1);
		
		for(Entry<String, Integer> e: greet.entrySet())
		{
			repeatEnd(e.getKey(), e.getValue());
		}
	}
	
	static void repeatEnd(String s, int n)
	{
		String repeatedChar = "";
		for(int i=0; i<n; i++)
		{
			repeatedChar += s.substring(s.length()-n);		
		}
		System.out.println(repeatedChar);
	}

}
