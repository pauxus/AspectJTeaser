package com.blackbuild.training.aspectj;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.blackbuild.training.aspectj.aspects.Trace;

/**
 * Demo Class to demonstrate Inner Aspects.
 * @author stephan
 *
 */
public class BookStoreDemo {

	private List<Book> books = new ArrayList<Book>();
	
	public void businessCase(String title) {
		Book newBook = createNewBook(title);
		registerBook(newBook);
		printTotalNumberOfBooksInStore();
	}
	
	private void printTotalNumberOfBooksInStore() {
		System.out.println("Total Number of Books: " + books.size());
	}

	@Trace
	private void registerBook(Book book) {
		books.add(book);
	}

	private Book createNewBook(String title) {
		return new Book();
	}

	public static void main(String[] args) {
		
		BookStoreDemo bookStoreDemo = new BookStoreDemo();
		
		bookStoreDemo.businessCase("Hallo Welt");
	}
	
	@Aspect
	private static class Logging {
		
		@Before("execution(* BookStoreDemo.businessCase(String)) && args(title)")
		public void logBusinessCase(String title) {
			System.out.println("Creating new Book: " + title);
		}
		
	}
	
	
}
