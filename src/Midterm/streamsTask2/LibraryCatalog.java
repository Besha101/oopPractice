package Midterm.streamsTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibraryCatalog {


    private List<Book> books;


    public LibraryCatalog(){
        this.books=new ArrayList<>();

    }



    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getAllBooks(){
        return this.books;
    }

    public Optional<Book> getBookByTitle(String title){
        return books.stream().filter(book->book.title().equals(title)).findFirst();
    }

    public List<Book> getBooksByAuthor(String author){
        return books.stream().filter(book->book.author().equals(author)).toList();
    }

    public List<Book> getBooksPublishedAfterYear(int year){
        return books.stream().filter(book->book.publicationYear()>=year).toList();
    }

    public List<String> getBookTitlesByGenre(Genre genre) {
        return books.stream().filter(book->book.genre()==genre).map(Book::title).toList();
    }



}
