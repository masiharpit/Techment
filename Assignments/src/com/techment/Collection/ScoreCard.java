package com.techment.Collection;

import java.util.HashMap;
import java.util.Map.Entry;

class RunsScored
{
	HashMap<String, Integer> runsScored = new HashMap<String, Integer>();
	transient int total = 0;
	public RunsScored(){}
	
	public void addScores(String name, Integer runs)
	{
		runsScored.put(name, runs);
	}
	
	public void display()
	{
		System.out.println("Players who batted: ");
		for(Entry<String, Integer> e: runsScored.entrySet())
		{
			System.out.println(e.getKey());
		}
		System.out.println("Scores by Players: ");
		for(Entry<String, Integer> e : runsScored.entrySet())
		{
			System.out.println(e.getKey()+ " : "+e.getValue());
		}
	}
	
	public void totalRuns()
	{
		for(Entry<String, Integer> e: runsScored.entrySet())
		{
			total = total + e.getValue();
		}
		System.out.println("Total Runs: "+total);
	}
	
	public void highestScorer()
	{
		int highestScore = 0;
		String name = "";
		for(Entry<String, Integer> e: runsScored.entrySet())
		{
			if(e.getValue() > highestScore)
			{
				highestScore = e.getValue();
				name = e.getKey();
			}
		}
		System.out.println("Name of Highest Scorer: "+ name);
	}
	
	public void runsScoredByPlayer(String name)
	{
		int score = 0;
		for(Entry<String, Integer> e : runsScored.entrySet())
		{
			if(e.getKey().equals(name)) 
			{
				score = e.getValue();
			}
		}
		System.out.println("Runs Scored by "+name+": "+score);
	}
}


public class ScoreCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunsScored rs = new RunsScored();
		rs.addScores("Rahane", 20);
		rs.addScores("Rahul", 30);
		rs.addScores("Kohli", 150);
		rs.addScores("Dhoni", 50);
		rs.addScores("Lokesh", 2);
		
		rs.display();
		rs.totalRuns();
		rs.highestScorer();
		rs.runsScoredByPlayer("Dhoni");
	}

}
