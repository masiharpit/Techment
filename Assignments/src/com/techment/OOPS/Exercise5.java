package com.techment.OOPS;

import java.time.LocalDate;

abstract class Medicine
{
	private int price;
	private LocalDate date;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	abstract public void displayLabel();

}

class Tablet extends Medicine
{
	@Override
	public void displayLabel()
	{
		System.out.println("Price: "+getPrice()+"\nDate of Issue: "+getDate()+"\nIntake only if prescribed by the Doctor.");
	}

	
}

class Syrup extends Medicine
{
	public void displayLabel()
	{
		System.out.println("Price: "+getPrice()+"\nDate of issue: "+getDate()+"\nStore it in cool dry place.");
	}
}

class Ointment extends Medicine
{
	public void displayLabel()
	{
		System.out.println("Price: "+getPrice()+"\ndate of issue: "+getDate()+"\nFor external use only.");
	}
}
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====================================Tablet=====================================================");
		Medicine tablet = new Tablet();
		tablet.setPrice(45);
		tablet.setDate(LocalDate.of(2021, 8, 15));
		tablet.displayLabel();
		System.out.println("======================================Syrup====================================================");
		Medicine syrup = new Syrup();
		syrup.setPrice(80);
		syrup.setDate(LocalDate.of(2021, 8, 13));
		syrup.displayLabel();
		System.out.println("======================================Ointment====================================================");
		Medicine ointment = new Ointment();
		ointment.setPrice(137);
		ointment.setDate(LocalDate.of(2021, 7, 8));
		ointment.displayLabel();
		
	}

}
