package org.example.Quizz4.a3rdTask;

public class main {

    public static void main(String[] args) throws MySystemException {
        String fileName="data3.txt";
        Student student=new Student();
        student.setFirstName("Jane");
        student.setLastName("Doe");
        student.setAge(20);

        Parser.saveConfigurableFields(fileName,student);
        Parser.saveConfigurableFields(fileName,student);
        Parser.saveConfigurableFields(fileName,student);
        Parser.saveConfigurableFields(fileName,student);



    }
}
