package com.techment.NewFeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate = (num) -> num>18;
		System.out.println(predicate.test(20));
		
		Predicate<String> predicate1 = (name) -> name.length() > 4;
		System.out.println(predicate1.test("Arpit"));
		
		Function<Integer, Integer> function = (num) -> num;
		Function<Integer, String> function1 = (num) -> "Value of: "+num;
		Function<String, Integer> function2 = (name) -> name.length();
		System.out.println(function.apply(5));
		System.out.println(function1.apply(10));
		System.out.println(function2.apply("Arpit"));
	}

}
