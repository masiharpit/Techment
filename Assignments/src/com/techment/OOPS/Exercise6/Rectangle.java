package com.techment.OOPS.Exercise6;

public class Rectangle {
	float length;
	float breadth;
	
	public Rectangle(float length, float breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public void calcArea()
	{
		System.out.println("Area of Rectangle: "+(length*breadth));
	}
	
	public void calcPerimeter()
	{
		System.out.println("Perimeter of Rectangle: "+(2*(length+breadth)));
	}
}
