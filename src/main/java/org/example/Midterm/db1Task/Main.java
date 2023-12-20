package org.example.Midterm.db1Task;

/*
-- Table 1: Customers
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100)
);

-- Table 2: Orders
CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    OrderDate DATE,
    TotalAmount DECIMAL(10, 2),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Insert data into Customers table
INSERT INTO Customers (CustomerID, FirstName, LastName, Email) VALUES
(1, 'John', 'Doe', 'john.doe@email.com'),
(2, 'Jane', 'Smith', 'jane.smith@email.com'),
(3, 'Bob', 'Johnson', 'bob.johnson@email.com');

-- Insert data into Orders table
INSERT INTO Orders (OrderID, CustomerID, OrderDate, TotalAmount) VALUES
(101, 1, '2023-11-18', 50.00),
(102, 1, '2023-11-19', 75.50),
(103, 2, '2023-11-20', 120.25),
(104, 3, '2023-11-21', 30.00);
 */

public class Main {

    public static void main(String[] args) {
        dbConnect dbConnect=new dbConnect();
        dbConnect.toString();
    }
}
