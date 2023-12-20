package org.example.Midterm.a5thTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDao implements DAO<Book>{

    private List<Book> bookList=new ArrayList<>();
    private long nextId=1;

    @Override
    public Optional<Book> create(Book entity){
        entity.setId(nextId++);

        bookList.add(entity);

        return Optional.of(entity);
    }

    @Override

    public Optional<Book> read(long id){
        for(Book book:bookList){
            if(book.getId()==id){
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Book> update(Book entity){
        for(int i=0;i<bookList.size();i++){
            if(bookList.get(i).getId()== entity.getId()){
                bookList.set(i,entity);
                return Optional.of(entity);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(long id){
        for(int i=0;i<bookList.size();i++){
            if(bookList.get(i).getId()==id){
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }




}
