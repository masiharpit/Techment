package com.techment.NewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
		{
			numbers.add(i);
		}
		System.out.println("Numbers: "+numbers);
		
		numbers.stream().filter(num -> num%2 ==0).forEach(s->System.out.println(s));
		
		List<Integer> nu = Arrays.asList();
		System.out.println("By Using Map");
		numbers.parallelStream().map(num ->"After adding 100: "+ (num+100)).forEach(s->System.out.println(s));
		
		numbers.stream().limit(4).forEach(s-> System.out.println(s));
		numbers.stream().skip(4).forEach(s -> System.out.println(s))
		
		Long size = numbers.stream()
	}

}
