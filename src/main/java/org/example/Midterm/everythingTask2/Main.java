package org.example.Midterm.everythingTask2;

import java.util.Optional;
/*

Task: Employee Record Management System

Develop a Java program for managing employee records. Create classes and methods to handle
the following tasks:

Create an Employee Record Class:

Implement a record named EmployeeRecord with fields for:
String employeeId
String name
String position
double salary
Include appropriate constructors and accessors.
Modify Employee Classes:

Introduce two employee classes, RegularEmployee and Manager, both extending a base class
 Employee.
Each employee class should have a corresponding EmployeeRecord, capturing details such as
the employee's ID, name, position, and salary.
Modify Employee Record Management System:

Implement a class named EmployeeRecordSystem to manage employee records.
Methods to be implemented:
void addEmployeeRecord(EmployeeRecord employeeRecord) to add a new employee record.
Optional<EmployeeRecord> getEmployeeRecord(String employeeId) to retrieve an employee record
 based on the employee ID.
void updateSalary(String employeeId, double newSalary) to update the salary for an employee.
Calculate Average Salary:

Implement a method in EmployeeRecordSystem to calculate the average salary for all employees.
Main Method and Testing:

In the main method, instantiate the EmployeeRecordSystem.
Add employee records for both regular employees and managers.
Test the methods:
Add employee records.
Retrieve employee records.
Update salaries.
Calculate the average salary.
Ensure proper encapsulation, accurate average salary calculations, and effective testing of
the implemented methods.
 */
public class Main {
    public static void main(String[] args) {
        // Step 5: Main Method and Testing
        // Instantiate the EmployeeRecordSystem
        EmployeeRecordSystem employeeRecordSystem = new EmployeeRecordSystem();

        // Test the methods
        employeeRecordSystem.addEmployeeRecord(new EmployeeRecord("E001", "John Doe", "Developer", 75000.0));
        employeeRecordSystem.addEmployeeRecord(new EmployeeRecord("E002", "Jane Smith", "Manager", 95000.0));

        Optional<EmployeeRecord> employeeRecord = employeeRecordSystem.getEmployeeRecord("E001");
        System.out.println("Employee Record for E001: " + employeeRecord.orElse(new EmployeeRecord("DefaultId","DefaultName","DefaultPosition",0.0)));

        employeeRecordSystem.updateSalary("E002", 100000.0);

        double averageSalary = employeeRecordSystem.calculateAverageSalary();
        System.out.println("Average Salary: " + averageSalary);
    }
}
