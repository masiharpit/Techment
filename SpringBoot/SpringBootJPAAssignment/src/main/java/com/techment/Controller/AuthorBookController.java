package com.techment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.Entity.Author211;
import com.techment.Entity.Book211;
import com.techment.Service.IAuthorBookService;

@RestController
@RequestMapping(value="/")
public class AuthorBookController {

	@Autowired
	IAuthorBookService iAuthorBookService;
	
	public List<Book211> showAllBooks()
	{
		return iAuthorBookService.showAllBooks();
	}
	
	
}
