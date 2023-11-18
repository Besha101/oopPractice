package Midterm.a5thTask;
import java.sql.*;
import java.sql.Connection;
import java.util.Optional;

public class DatabaseBookDAO implements DAO<Book> {
    String url="jdbc:mysql://localhost:3306/jdbc";
    String username="root";
    String password="";
    @Override
    public Optional<Book> create(Book entity) {
        try (Connection connection = DriverManager.getConnection(url,username,password);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO books (title, author, published_year) VALUES (?, ?, ?)",
                     Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, entity.getTitle());
            preparedStatement.setString(2, entity.getAuthor());
            preparedStatement.setInt(3, entity.getPublishedYear());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating book failed, no rows affected.");
            }

            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    entity.setId(generatedKeys.getLong(1));
                } else {
                    throw new SQLException("Creating book failed, no ID obtained.");
                }
            }

            return Optional.of(entity);

        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Book> read(long id) {

        try (
                Connection connection = DriverManager.getConnection(url,username,password);
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "SELECT * FROM books WHERE id=?"
                )) {

            preparedStatement.setLong(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return Optional.of(new Book(
                            resultSet.getString("title"),
                            resultSet.getString("author"),
                            resultSet.getInt("published_year")
                    ));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.empty();

    }

    @Override
    public Optional<Book> update(Book entity) {
        try (Connection connection = DriverManager.getConnection(url,username,password);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE books SET title = ?, author = ?, published_year = ? WHERE id = ?")) {

            preparedStatement.setString(1, entity.getTitle());
            preparedStatement.setString(2, entity.getAuthor());
            preparedStatement.setInt(3, entity.getPublishedYear());
            preparedStatement.setLong(4, entity.getId());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Updating book failed, no rows affected.");
            }

            return Optional.of(entity);

        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public boolean delete(long id) {
        try(
                Connection connection=DriverManager.getConnection(url,username,password);
                PreparedStatement preparedStatement=connection.prepareStatement(
                        "DELETE FROM books WHERE ID=?"
                )

                ){

            preparedStatement.setLong(1,id);
            int affectedRows= preparedStatement.executeUpdate();

            return affectedRows>0;

        }

        catch (SQLException e){
            e.printStackTrace();
            return false;
        }


    }
}



