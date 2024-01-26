package org.example.Final.Testing.Week10.aLabPractice.a2ndTask;

import java.util.Arrays;

public class Student {

    private String name;
    private int ID;
    int[] grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }


    public String printInfo() {
        return "name='" + name + '\'' +
                ", ID=" + ID +
                ", grades=" + Arrays.toString(grades);
    }
}
