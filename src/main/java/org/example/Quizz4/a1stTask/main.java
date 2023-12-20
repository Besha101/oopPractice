package org.example.Quizz4.a1stTask;

import org.example.Quizz4.a2ndTask.MySystemException;
import org.example.Quizz4.a2ndTask.Parser;
import org.example.Quizz4.a2ndTask.Student;

public class main {
    public static void main(String[] args) throws MySystemException {
        String fileName="data1.txt";
        Student student=new Student();
        student.setFirstName("Jane");
        student.setLastName("Doe");
        student.setAge(20);

        Parser.saveConfigurableFields(fileName,student);

    }
}
