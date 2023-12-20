package org.example.Midterm.a5thTask;

import java.util.Optional;

/*
Database name: jdbc
Database table name: books
SQL:
CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    published_year INT
);

 */

public class Main {
    public static void main(String[] args) {
        // Test in-memory BookDao
        System.out.println("Testing In-Memory BookDao:");
        testDao(new BookDao());

        // Test database BookDao
        System.out.println("\nTesting Database BookDao:");
        testDao(new DatabaseBookDAO());
    }

    private static void testDao(DAO<Book> dao) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);


        dao.create(book1);
        System.out.println("Created: " + book1);


        long book1Id = book1.getId();
        Optional<Book> retrievedBook = dao.read(book1Id);
        System.out.println("Retrieved: " + retrievedBook.orElse(new Book("Book not found", "", 0)));


        book1.setAuthor("F. S. Fitzgerald");
        dao.update(book1);
        System.out.println("Updated: " + book1);


        boolean deleteResult = dao.delete(book1Id);
        System.out.println("Deleted: " + (deleteResult ? "Success" : "Failed"));


        retrievedBook = dao.read(book1Id);
        System.out.println("Retrieved after deletion: " + retrievedBook.orElse(new Book("Book not found", "", 0)));
    }

}
