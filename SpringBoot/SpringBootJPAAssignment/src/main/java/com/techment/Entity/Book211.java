package com.techment.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Book211")
public class Book211 {

	@Id
	private int isbn;
	private String title;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="id")
	Author211 author;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author211 getAuthor() {
		return author;
	}

	public void setAuthor(Author211 author) {
		this.author = author;
	}
	
}
