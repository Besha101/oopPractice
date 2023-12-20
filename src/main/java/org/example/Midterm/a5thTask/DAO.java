package org.example.Midterm.a5thTask;
import java.util.Optional;

public interface DAO<T> {

    Optional <T> create(T entity);
    Optional <T> read(long id);
    Optional <T> update(T entity);
    boolean delete(long id);


}
