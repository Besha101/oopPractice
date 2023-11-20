package Midterm.streamsTask2;

public class Main {

    public static void main(String[] args) {

        LibraryCatalog libraryCatalog=new LibraryCatalog();

        libraryCatalog.addBook(new Book("The Hobbit", "J.R.R. Tolkien", Genre.FICTION, 1937));
        libraryCatalog.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", Genre.HISTORY, 1951));
        // Test getAllBooks method
        System.out.println("All Books:");
        libraryCatalog.getAllBooks().forEach(book -> System.out.println(book.title()));

        // Test getBookByTitle method
        String targetTitle = "The Hobbit";
        System.out.println("\nBook by title '" + targetTitle + "':");
        libraryCatalog.getBookByTitle(targetTitle).ifPresent(book -> System.out.println(book));

        // Test getBooksByAuthor method
        String targetAuthor = "J.R.R. Tolkien";
        System.out.println("\nBooks by author " + targetAuthor + ":");
        libraryCatalog.getBooksByAuthor(targetAuthor).forEach(book -> System.out.println(book.title()));

        // Test getBooksPublishedAfterYear method
        int targetYear = 2000;
        System.out.println("\nBooks published after " + targetYear + ":");
        libraryCatalog.getBooksPublishedAfterYear(targetYear).forEach(book -> System.out.println(book.title()));

        // Test getBookTitlesByGenre method
        Genre targetGenre = Genre.FICTION;
        System.out.println("\nBook titles in the " + targetGenre + " genre:");
        libraryCatalog.getBookTitlesByGenre(targetGenre).forEach(System.out::println);
    }

}
