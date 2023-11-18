package Midterm.db2Task;

import java.sql.*;

public class dbConnect {

    private static final String url="jdbc:mysql://localhost:3306/testJava";
    private static final String username="root";
    private static final String password="";

    public dbConnect(){
        try{
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(
                    "SELECT c.CustomerID, c.FirstName,c.LastName,SUM(o.TotalAmount) AS TotalAmountSpent FROM Customers c LEFT JOIN Orders o ON c.CustomerID=o.CustomerID GROUP BY c.CustomerID, c.FirstName, c.LastName"
            );

            while(resultSet.next()){
                System.out.println(
                        resultSet.getInt(1)+" "
                        +resultSet.getString(2)+" "
                        +resultSet.getString(3)+" "
                        +resultSet.getDouble(4)
                );
            }
        }

        catch (SQLException e){
            throw new RuntimeException();
        }
    }

}
