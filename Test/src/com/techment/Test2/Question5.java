package com.techment.Test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Question5 {

	public static void main(String[] args) {
		Map<Integer,Integer> voters =new HashMap<Integer, Integer>();
		voters.put(112, 18);
		voters.put(123, 60);
		voters.put(456, 44);
		voters.put(687, 12);
		voters.put(908, 19);
		voters.put(349, 10);
		voters.put(899, 36);
		voters.put(545, 55);
		voters.put(786, 34);
		voters.put(56, 29);
		
		voterList(voters);
		
		
	}

	static void voterList(Map<Integer, Integer> voters) 
	{
		List<Integer> validVoters = new ArrayList<Integer>();
		for(Entry<Integer, Integer> entry : voters.entrySet())
		{
			if(entry.getValue() > 18) 
			   validVoters.add(entry.getKey());
		}

		System.out.println("List of Valid Voters: ");
		for(Integer voterId : validVoters)
		{
			System.out.println(voterId);
		}
	}

	
}