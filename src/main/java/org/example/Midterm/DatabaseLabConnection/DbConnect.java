package org.example.Midterm.DatabaseLabConnection;

import java.sql.*;

public class DbConnect {

    private static final String url="jdbc:mysql://localhost:3306/lab3";
    private static final String username="root";
    private static final String password="";

    public DbConnect(){
        try{
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();

            /*
            ResultSet resultSet= statement.executeQuery(
                    "SELECT * FROM tasks"
            );

             */

            ResultSet resultSet= statement.executeQuery(
                    "SELECT * FROM tasks WHERE id=3"
            );

            while (resultSet.next()){
                System.out.println(
                        resultSet.getInt(1)+" "
                        +resultSet.getString(2)+" "
                        +resultSet.getString(3)
                );
            }



            connection.close();

        }

        catch (SQLException e){
            throw new RuntimeException();
        }
    }

}
