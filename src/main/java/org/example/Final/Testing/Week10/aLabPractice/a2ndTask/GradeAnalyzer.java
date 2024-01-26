package org.example.Final.Testing.Week10.aLabPractice.a2ndTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeAnalyzer {

    List<Integer> grades;


    public GradeAnalyzer(List<Integer> grades) {
        this.grades = grades;
    }

    public double calculateAverage(){
        double sum=0;

        for(Integer grade: grades){
            sum+=grade;
        }

        return sum/grades.size();

    }


    public String printSummary() {
        return "grades= "+ grades ;
    }




}
