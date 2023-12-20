package org.example.Midterm.db3Task;

import java.sql.*;

public class dbConnect {

    private static final String url="jdbc:mysql://localhost:3306/testJava";
    private static final String username="root";
    private static final String password="";

    public dbConnect(){

        try{
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(
                    "SELECT * FROM Orders"
            );

            while(resultSet.next()){
                System.out.println(
                        "OrderID: "
                        +resultSet.getInt(1)+", CustomerID: "
                        +resultSet.getInt(2)+", OrderDate: "
                        +resultSet.getDate(3)+", TotalAmount: "
                        +resultSet.getDouble(4)
                );
            }
        }

        catch(SQLException e){
            throw new RuntimeException();
        }

    }

}
