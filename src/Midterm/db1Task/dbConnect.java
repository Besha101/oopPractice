package Midterm.db1Task;

import java.sql.*;

public class dbConnect {

    private static final String url="jdbc:mysql://localhost:3306/testJava";
    private static final String username="root";
    private static final String password="";

    public dbConnect(){
        try{
            Connection connection= DriverManager.getConnection(url,username,password);
            System.out.println("Connection successful");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(
                    "SELECT * FROM Customers c JOIN Orders o ON c.CustomerID=o.CustomerID"
            );

            while(resultSet.next()){
                System.out.println(
                        resultSet.getInt(1)+" "
                        +resultSet.getString(2)+" "
                        +resultSet.getString(3)+" "
                        +resultSet.getString(4)
                );
            }

            connection.close();
        }



        catch (SQLException e){
            throw new RuntimeException();
        }
    }

}
