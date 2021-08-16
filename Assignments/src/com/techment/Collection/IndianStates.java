package com.techment.Collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class IndianStates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> states = new LinkedHashSet<String>();
		TreeSet<String> states1 = new TreeSet<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("F:\\Techment\\Logic Building Exercises\\Assignments\\src\\com\\techment\\Collection\\IndianStates.txt"));
			String line = br.readLine();
			while(line != null)
			{
				states.add(line);
				states1.add(line);
				line = br.readLine();
			}
			int count = 0;
			for(String state : states)
			{
				System.out.println(state);
				count++;
			}
			System.out.println("==============================================================================================");
			System.out.println("Number of States present in the file: "+count);
			for(String state : states)
			{
				if(state.equals("Delhi"))
				{
					states.remove(state);
				}
			}
			System.out.println("==================================== States starting with letter K:====================================");
			for(String state : states)
			{
				if(state.charAt(0) == 'K')
				{
					System.out.println(state);
				}
			}
			System.out.println("=====================================Sorted states:==========================================");
			for(String state : states1)
			{
				System.out.println(state);
			}
			
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}





