package org.example.Final.Testing.Week10.FileManipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class a3rdTask {

    public static void SimpleRead(String fileName) throws IOException{

        BufferedReader bufferedReader=new BufferedReader(
                new FileReader(fileName)
        );

        System.out.println(bufferedReader.readLine());
        bufferedReader.close();


    }

    public static void main(String[] args) throws IOException{

        SimpleRead("output1.txt");

    }


}
