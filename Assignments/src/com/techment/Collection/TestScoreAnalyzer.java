package com.techment.Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyzer
{
	private LinkedList<Integer> runsData = new LinkedList<Integer>();
	transient int total = 0;
	
	public ScoreAnalyzer() {
		super();
	}

	public void addRunsTolist(Integer runs)
	{
		runsData.add(runs);
	}
	
	public void calcRunRate()
	{
		for(Integer runs : runsData)
		{
			total = total + runs;
		}
		System.out.println("\nRunrate: "+(total/50));
	}
	
	public void displayRuns()
	{
		int i =1;
		System.out.print("Runs Scored: ");
		for(Integer runs : runsData)
		{
			System.out.print(i+"-"+runs+" ");
			i++;
		}
	}
	
	public void lowestRun()
	{
		System.out.println("Lowest Runs: "+Collections.min(runsData));
		
	}
}
public class TestScoreAnalyzer {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of players: ");
		int players = scanner.nextInt();
		ScoreAnalyzer as = new ScoreAnalyzer();
		int run=0;
		for(int i=0; i<players; i++)
		{
			System.out.print("Enter the run scored by Player "+(i+1)+ ": ");
			run = scanner.nextInt();
			as.addRunsTolist(run);
		}
		as.displayRuns();
		as.calcRunRate();
		System.out.println("Count of player who batted: "+players);
		scanner.close();
	}

}
