package com.techment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.Dao.IAuthorDao;
import com.techment.Dao.IBookDao;
import com.techment.Entity.Book211;

@Service
public class AuthorBookServiceImpl implements IAuthorBookService {

	@Autowired
	IAuthorDao iAuthorDao;
	
	@Autowired
	IBookDao iBookDao;
	
	@Override
	public List<Book211> showAllBooks()
	{
		return iBookDao.findAll();
	}
	
	
	
}
