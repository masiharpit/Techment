package com.techment.Test2;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> desert = new LinkedHashMap<String, Integer>();
		
		desert.put("Chocolate", 3);
		desert.put("Ice Cream", 2);
		
		for(Entry<String, Integer> e: desert.entrySet())
		{
			repeatFront(e.getKey(), e.getValue());
		}
	}
	
	static void repeatFront(String name, int n)
	{
		String repeatedChar = "";
		for(int i=n; i>0;i--)
		{
			repeatedChar += name.substring(0, i);
		}
		System.out.println(repeatedChar);
	}

}
