package com.library.service;

import java.util.ArrayList;

import com.library.exception.BookNotAvailableException;
import com.library.model.Book;

public class Library implements Borrowable {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {

        books.add(book);
        System.out.println(book.getTitle() + " added successfully.");
    }

    // Display All Books
    public void displayBooks() {

        if (books.isEmpty()) {

            System.out.println("Library is empty.");
            return;
        }

        for (Book book : books) {

            book.displayBookDetails();
            System.out.println("--------------------------------");
        }
    }

    // Search Book
    public Book searchBook(int id) {

        for (Book book : books) {

            if (book.getBookId() == id) {

                return book;
            }
        }

        return null;
    }

    // Remove Book
    public void removeBook(int id) {

        Book book = searchBook(id);

        if (book != null) {

            books.remove(book);
            System.out.println("Book removed successfully.");
        } else {

            System.out.println("Book not found.");
        }
    }

    // Borrow Book
    @Override
    public void borrowBook() {

        // Will be called from Main
    }

    public void borrowBook(int id) throws BookNotAvailableException {

        Book book = searchBook(id);

        if (book == null) {

            System.out.println("Book not found.");
            return;
        }

        if (!book.isAvailable()) {

            throw new BookNotAvailableException("Book is already issued.");
        }

        book.setAvailable(false);

        System.out.println("Book borrowed successfully.");
    }

    // Return Book
    @Override
    public void returnBook() {

        // Interface implementation
    }

    public void returnBook(int id) {

        Book book = searchBook(id);

        if (book == null) {

            System.out.println("Book not found.");
            return;
        }

        book.setAvailable(true);

        System.out.println("Book returned successfully.");
    }

}