package com.techment.OOPS;

class Books
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Books [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}

class EngineeringBook extends Books
{
	private String category;
	
	EngineeringBook()
	{
		super();
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "EngineeringBook [category= " + category + " bookNo: "+super.getBookNo() + " Book Title: "+ super.getTitle() 
		+ " Author: "+super.getAuthor()+ " Price: "+super.getPrice()+"]";
	}
	
	
	
}

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books book = new Books();
		book.setBookNo(4653);
		book.setTitle("The Intelligent Investor");
		book.setAuthor("Benjamin Graham");
		book.setPrice(479.0f);
		
		System.out.println(book.toString());
		
		EngineeringBook engineeringbook = new EngineeringBook();
		engineeringbook.setCategory("Engineering Book");
		engineeringbook.setBookNo(8659);
		engineeringbook.setTitle("Core JAVA");
		engineeringbook.setAuthor("Dr. R. Nageswara Rao");
		engineeringbook.setPrice(539.0f);
		System.out.println(engineeringbook.toString());
	}

}
