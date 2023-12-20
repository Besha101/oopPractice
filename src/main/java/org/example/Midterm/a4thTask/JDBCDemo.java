package org.example.Midterm.a4thTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbc";
        String username="root";
        String password="";
        try {
            

            Connection connection= DriverManager.getConnection(url,username,password);

            Statement statement=connection.createStatement();

            ResultSet resultSet=statement.executeQuery("SELECT * FROM student");

            while(resultSet.next()){

                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));

            }

            connection.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
