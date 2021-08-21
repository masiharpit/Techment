package com.techment.OOPS.Exercise6;

public class Square implements Polygon {
	float side;
	
	public Square(float side)
	{
		this.side = side;
	}
	
	public void calcArea()
	{
		System.out.println("Area of Square: "+(side*side));
	}
	
	public void calcPerimeter()
	{
		System.out.println("Parimeter of Square: "+(4*side));
	}
	
}
