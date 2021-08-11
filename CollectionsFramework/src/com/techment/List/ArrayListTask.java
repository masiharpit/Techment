package com.techment.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Batch1 = new ArrayList<String>();
		Batch1.add("Joe");
		Batch1.add("Steve");
		Batch1.add("Bob");
		Batch1.add("Karl");
		
		ArrayList<String> Batch2 = new ArrayList<String>();
		Batch2.add("Steve");
		Batch2.add("Jackson");
		Batch2.add("Robbie");
		Batch2.add("Henderson");
		Batch2.add("Karl");
		
		System.out.println("Candidates in Batch-1: "+Batch1);
		System.out.println("Candidates in Batch-2: "+Batch2);
		
		Batch2.removeAll(Batch1);
		System.out.println("After removing Batch-1 candidates: "+Batch2);
		
		ArrayList<String> batch = new ArrayList<String>();
		for(String name: Batch1)
		{
			batch.add(name);
		}
		for(String name: Batch2)
		{
			batch.add(name);
		}
		System.out.println("Combined names of all the batches: "+batch);
		Collections.sort(batch);
		System.out.println(batch);
	}

}
