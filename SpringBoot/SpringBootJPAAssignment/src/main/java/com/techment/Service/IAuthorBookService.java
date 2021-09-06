package com.techment.Service;

import java.util.List;

import com.techment.Entity.Book211;

public interface IAuthorBookService {

	public List<Book211> showAllBooks();
	public List<Book211> booksByAuthor();
	
}
