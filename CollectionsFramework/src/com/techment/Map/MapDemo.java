package com.techment.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Arpit");
		hm.put(2, "Divya");
		hm.put(3, "Katyayani");
		hm.put(4, "Navin");
		hm.put(5, "Gitika");
		hm.put(6, "Rajshri");
		
		System.out.println("HashMap: "+ hm);
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "Arpit");
		lhm.put(2, "Divya");
		lhm.put(3, "Katyayani");
		lhm.put(4, "Navin");
		lhm.put(5, "Gitika");
		lhm.put(6, "Rajshri");
		
		System.out.println("LinkedHashMap: "+lhm);
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "Arpit");
		tm.put(2, "Divya");
		tm.put(3, "Katyayani");
		tm.put(4, "Navin");
		tm.put(5, "Gitika");
		tm.put(6, "Rajshri");
		
		System.out.println("TreeMap: "+tm);
		
		for(Entry<Integer, String> e: hm.entrySet())
		{
			System.out.println(e);
			System.out.println("Key: "+e.getKey());
			System.out.println("Value: "+e.getValue());
		}
		
		for(String s: hm.values())
		{
			System.out.println(s);
		}
	}

}
