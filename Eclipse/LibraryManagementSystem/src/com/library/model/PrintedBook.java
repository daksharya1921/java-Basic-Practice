package com.library.model;

public class PrintedBook extends Book {

	private int numberOfPages;
	
	public PrintedBook(int id, String title, String author, int pages) {
		super(id,title,author);
		this.numberOfPages = pages;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
		
	}
	
	public void displayBookDetails() {
		System.out.println("Printed Book");
		System.out.println("Book ID : "+getBookId());
		System.out.println("Title : "+getTitle());
		System.out.println("Author : "+getAuthor());
		System.out.println("Pages : "+numberOfPages);
		System.out.println("Available : "+isAvailable());
	}
}
