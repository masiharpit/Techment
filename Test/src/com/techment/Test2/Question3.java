package com.techment.Test2;

import java.util.ArrayList;
import java.util.stream.Collectors;

class WWE{
	private String firstName;
	private String lastName;
	private int weight;
	
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		lastName = lastName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
		
}

class  WWEWrestlerImplementation{
	
	//this will show the number of wrestler
	public long numOfWrestlers(ArrayList<WWE> wwe)
	{
		long countWrestlers = wwe.stream().count();
		return countWrestlers;
	}
	
	//this will return sum of the weight greater than 200 
	public long sumOfWeight(ArrayList<WWE> wwe)
	{
	long sum = wwe.stream().filter(p -> (p.getWeight() > 200)).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();;
	return sum;
	}
	
	//this will print the first name of all wrestler
	public void printFirstName(ArrayList<WWE> wwe) 
	{
		wwe.stream().forEach(p -> System.out.println(p.getFirstName()));
	}
	
//	this will print the minimum weight or the wrestler
	public int minWeight(ArrayList<WWE>wwe) 
	{
		int minW = wwe.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
		return minW;
	}
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WWE> wwe = new ArrayList<WWE>();
		wwe.add(new WWE("Mark", "Henry", 260));
		wwe.add(new WWE("Ray", "Mysterio", 80));
		wwe.add(new WWE("Randy", "Ortan", 96));
		wwe.add(new WWE("The", "Rock", 124));
		wwe.add(new WWE("Roman", "Reign", 110));
		wwe.add(new WWE("Under", "Taker", 145));
		wwe.add(new WWE("Shawn", "Michaels", 102));
		wwe.add(new WWE("Tripple", "H", 118));
		wwe.add(new WWE("Big", "Show", 258));
			
		WWEWrestlerImplementation wweImp = new WWEWrestlerImplementation();
	
		
		System.out.println("================Number of Wrestlers===================");
		System.out.println("The numbers of wrestler is :"+ wweImp.numOfWrestlers(wwe));
		
		System.out.println("=================Sum of Wrestlers more than 200==================");
		System.out.println("The sum of wrestler is :" + wweImp.sumOfWeight(wwe));
		
		System.out.println("================Minimum weight amongst all the Wrestlers===================");
		System.out.println("minum weight is " + wweImp.minWeight(wwe));
	}
	

}
