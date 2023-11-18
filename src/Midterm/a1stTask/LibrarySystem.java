package Midterm.a1stTask;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    public void displayBookDetails(List<Book> bookList){
        for(Book book:bookList){
            System.out.println(book);
        }
    }
    public void filterBooksByAuthor(List<Book> bookList, String authorName){
        List<Book> authorList=new ArrayList<>();
        for(Book book:bookList){
            if(book.getAuthor().equals(authorName)){
                authorList.add(book);
            }
        }

        displayBookDetails(authorList);
    }

    public int calculateTotalPages(List<Book> bookList){
        int sum=0;
        for(Book book:bookList){
            sum+=book.getPages();
        }

        return sum;
    }



}
