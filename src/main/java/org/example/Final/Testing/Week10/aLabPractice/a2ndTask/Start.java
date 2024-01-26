package org.example.Final.Testing.Week10.aLabPractice.a2ndTask;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Start {



    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        List<Integer> grades= Arrays.asList(90,85,95,88,92);
        GradeAnalyzer gradeAnalyzer=new GradeAnalyzer(grades);
        Class<?> gradeAnalyzerClass=gradeAnalyzer.getClass();





        Method[] methods=gradeAnalyzerClass.getDeclaredMethods();



        for (Method method:methods){
            if (method.getName().startsWith("calc")|| method.getName().startsWith("print")){
                System.out.println(method.getName()+" , method result: \n     "+method.invoke(gradeAnalyzer));
            }
        }
    }

}
