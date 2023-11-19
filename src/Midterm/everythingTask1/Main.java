package Midterm.everythingTask1;

import java.util.Optional;

/*
Task: Student Management System

Create a student management system in Java that incorporates abstract classes,
interfaces, generics, HashMaps, and Optionals. The system should handle information
about different types of students (regular and honors) and their grades.
 Follow the steps below:

Define an Interface (GradingSystem):

Create an interface named GradingSystem.
Include methods:
void addGrade(String studentId, double grade) to add grades for students.
Optional<Double> getGrade(String studentId) to retrieve the grade for a specific student.
double calculateAverageGrade() to calculate the average grade for all students.
Create an Abstract Class (Student):

Create an abstract class named Student with attributes:
String studentId
String name
Implement two concrete classes, RegularStudent and HonorsStudent, that extend the Student
 class.
Implement Grading System (HashMapGradingSystem):

Implement a class named HashMapGradingSystem that implements the GradingSystem interface.
Use a HashMap to store student grades.
Utilize Optionals to handle scenarios where a student may not have a recorded grade.
Use generics to allow the storage of grades as Double values.
 */
public class Main {
    public static void main(String[] args) {

        GradingSystem gradingSystem = new HashMapGradingSystem();


        gradingSystem.addGrade("123", 85.5);
        gradingSystem.addGrade("456", 90.0);
        gradingSystem.addGrade("789", 78.2);


        Optional<Double> grade = gradingSystem.getGrade("123");
        System.out.println("Grade for student 123: " + grade.orElse(0.0));

        double averageGrade = gradingSystem.calculateAverageGrade();
        System.out.println("Average grade: " + averageGrade);
    }
}
