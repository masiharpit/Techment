package com.techment.Stack;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(1);
		stack.add(2);
		stack.add(3);
		
		System.out.println("Elements of Stack: "+stack);
		System.out.println("Top Element: "+stack.peek());
		stack.pop();
		System.out.println("After removing: "+stack);
		
		System.out.println("Top Element: "+stack.peek());
	}

}
