package Midterm.everythingTask3;

/*
Here is a similar task with some differences:

Task: Student Record Management System

Develop a Java program for managing student records. Create classes and methods to handle
the following tasks:

Create a Student Record Class:

Implement a record named StudentRecord with fields for: String studentId String name
String major double gpa Include appropriate constructors and accessors. Modify
Student Classes:

Introduce two student classes, UndergraduateStudent and GraduateStudent, both extending
a base class Student. Each student class should have a corresponding StudentRecord,
capturing details such as the student’s ID, name, major, and GPA. Modify Student Record
Management System:

Implement a class named StudentRecordSystem to manage student records. Methods to be
implemented: void addStudentRecord(StudentRecord studentRecord) to add a new student record.
 Optional<StudentRecord> getStudentRecord(String studentId) to retrieve a student
 record based on the student ID. void updateGPA(String studentId, double newGPA)
 to update the GPA for a student.

 Calculate Average GPA:

Implement a method in StudentRecordSystem to calculate the average GPA for all students.
 Main Method and Testing:

In the main method, instantiate the StudentRecordSystem. Add student records for both
undergraduate and graduate students. Test the methods: Add student records. Retrieve student
records. Update GPAs. Calculate the average GPA. Ensure proper encapsulation,
accurate average GPA calculations, and effective testing of the implemented methods.
 */

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Step 5: Main Method and Testing
        // Instantiate the StudentRecordSystem
        StudentRecordSystem studentRecordSystem = new StudentRecordSystem();

        // Test the methods
        studentRecordSystem.addStudentRecord(new StudentRecord("S001", "John Doe", "Computer Science", 3.7));
        studentRecordSystem.addStudentRecord(new StudentRecord("S002", "Jane Smith", "Engineering", 3.9));

        Optional<StudentRecord> studentRecord = studentRecordSystem.getStudentRecord("S001");
        System.out.println("Student Record for S001: " + studentRecord);

        studentRecordSystem.updateGPA("S002", 4.0);

        double averageGPA = studentRecordSystem.avgGpa();
        System.out.println("Average GPA: " + averageGPA);
    }
}
