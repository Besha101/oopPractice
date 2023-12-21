package org.example.Quizz4.a3rdTask;

public class Student {

    @ConfigurableField
    private String firstName;

    @ConfigurableField
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
