package com.tns.service;

import java.util.List;

import com.tns.dao.BookDao;
import com.tns.dao.BookDaoImpl;
import com.tns.entities.Book;

public class BookServiceImpl implements BookService
{
	private BookDao dao;
	

	public BookServiceImpl() {
	dao=new BookDaoImpl();
		
	}

	@Override
	public Book getBookById(int id) {
		
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		
		return dao.getBookByTitle(title);
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		
		return dao.getBookByTitle(author);
	}

	@Override
	public List<Book> getBookInPriceRange(double low, double high) {
		
		return dao.getBookInPriceRange(low, high);
	}

	@Override
	public List<Book> getAllBooks() {
		
		return dao.getAllBooks();
	}

	@Override
	public Long getBookCount() {
		
		return dao.getBookCount();
	}

}
