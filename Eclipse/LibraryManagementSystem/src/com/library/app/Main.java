package com.library.app;



import java.util.Scanner;

import com.library.exception.BookNotAvailableException;
import com.library.model.Book;
import com.library.model.EBook;
import com.library.model.PrintedBook;
import com.library.service.Library;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        int choice;

        do {

            System.out.println("\n========== LIBRARY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Printed Book");
            System.out.println("2. Add EBook");
            System.out.println("3. Display All Books");
            System.out.println("4. Search Book");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Remove Book");
            System.out.println("8. Exit");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Book ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title : ");
                    String title = sc.nextLine();

                    System.out.print("Author : ");
                    String author = sc.nextLine();

                    System.out.print("Pages : ");
                    int pages = sc.nextInt();

                    PrintedBook pb =
                            new PrintedBook(id, title, author, pages);

                    library.addBook(pb);

                    break;

                case 2:

                    System.out.print("Book ID : ");
                    int eid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title : ");
                    String etitle = sc.nextLine();

                    System.out.print("Author : ");
                    String eauthor = sc.nextLine();

                    System.out.print("File Size (MB): ");
                    double size = sc.nextDouble();

                    EBook eb =
                            new EBook(eid, etitle, eauthor, size);

                    library.addBook(eb);

                    break;

                case 3:

                    library.displayBooks();

                    break;

                case 4:

                    System.out.print("Enter Book ID : ");
                    int sid = sc.nextInt();

                    Book b = library.searchBook(sid);

                    if (b != null) {

                        b.displayBookDetails();

                    } else {

                        System.out.println("Book not found.");

                    }

                    break;

                case 5:

                    System.out.print("Book ID : ");

                    int bid = sc.nextInt();

                    try {

                        library.borrowBook(bid);

                    } catch (BookNotAvailableException e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 6:

                    System.out.print("Book ID : ");

                    int rid = sc.nextInt();

                    library.returnBook(rid);

                    break;

                case 7:

                    System.out.print("Book ID : ");

                    int removeId = sc.nextInt();

                    library.removeBook(removeId);

                    break;

                case 8:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while (choice != 8);

        sc.close();
    }
}