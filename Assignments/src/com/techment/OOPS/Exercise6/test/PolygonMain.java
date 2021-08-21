package com.techment.OOPS.Exercise6.test;

import com.techment.OOPS.Exercise6.*;
public class PolygonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==============================================Square========================================");
		Square square = new Square(8);
		square.calcArea();
		square.calcPerimeter();
		System.out.println("==============================================Rectangle=====================================");
		Rectangle rectangle = new Rectangle(8, 10);
		rectangle.calcArea();
		rectangle.calcPerimeter();
	}

}
