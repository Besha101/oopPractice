package Midterm.a1stTask;

/*
Create a class named "Book" with the following attributes: title (String),
author (String), pages (int).

Then, create a class named "LibrarySystem" with the following methods:

filterBooksByAuthor: Accepts a list of books and an author's name,
and returns a new list containing only the books written by the specified author.

calculateTotalPages: Accepts a list of books and calculates the total number of
pages across all books.

displayBookDetails: Accepts a list of books and prints the details of each book.

In the main method, instantiate the "LibrarySystem" and create a list of books.
Perform the following operations:

Use the "filterBooksByAuthor" method to filter books by a specific author.
Use the "calculateTotalPages" method to calculate the total number of pages in all books.
Use the "displayBookDetails" method to print the details of each book.

 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();


        List<Book> books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 224));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 336));
        books.add(new Book("1984", "George Orwell", 328));


        librarySystem.filterBooksByAuthor(books,"Harper Lee");
        System.out.println();





        librarySystem.displayBookDetails(books);
        System.out.println();


        System.out.println("Total number of pages: "+librarySystem.calculateTotalPages(books));

    }

}
