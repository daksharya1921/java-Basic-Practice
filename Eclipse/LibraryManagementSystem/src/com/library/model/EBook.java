package com.library.model;

public class EBook extends Book {

	private double fileSize;
	
	public EBook(int id, String title,String author,double fileSize) {
		super(id, title, author);
		this.fileSize = fileSize;
	}
	
	public double getFileSize() {
		return fileSize;
	}
	
	public void setFileSize(double file) {
		this.fileSize = fileSize;
	}
	
	@Override
	public void displayBookDetails() {
		System.out.println("EBook");
		System.out.println("Book ID : "+getBookId());
		System.out.println("Title : "+getTitle());
		System.out.println("Author : "+getAuthor());
		System.out.println("File Size : "+ fileSize + " MB");
		System.out.println("Available : "+isAvailable());
	}
}
