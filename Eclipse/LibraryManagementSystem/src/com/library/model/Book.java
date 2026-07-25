package com.library.model;

public abstract class Book {

	private int bookId;
	private String title, author;
	private boolean available;

	public Book(int bookId, String title, String author) {
		this.author = author;
		this.available = true;
		this.bookId = bookId;
		this.title = title;

	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getBookId() {
		return bookId;
		
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getTitle() {
		return title;
		
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public abstract void displayBookDetails();
}
