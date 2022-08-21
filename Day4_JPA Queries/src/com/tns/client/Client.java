package com.tns.client;

import com.tns.service.BookService;
import com.tns.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService obj=new BookServiceImpl();
		System.out.println("Total No. of Books");
		System.out.println("Total Books: "+obj.getBookCount());
		
		System.out.println("Listing Book with Id:102");
		System.out.println("Total Books: "+obj.getBookById(102));
		


		System.out.println("Book written by James:");
		System.out.println("Total Books: "+obj.getAuthorBooks("James"));
		
		System.out.println("Book by title:");
		System.out.println("Total Books: "+obj.getBookByTitle("Python"));
		
		System.out.println("Book by title:");
		System.out.println("Total Books: "+obj.getBookInPriceRange(200, 500));
		
		
	}

}
