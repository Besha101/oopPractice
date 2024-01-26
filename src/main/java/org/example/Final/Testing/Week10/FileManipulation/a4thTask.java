package org.example.Final.Testing.Week10.FileManipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class a4thTask {

    public static void ReadWholeFile(String fileName) throws IOException{

        BufferedReader bufferedReader=new BufferedReader(
                new FileReader(fileName)
        );

        String temp;

        while ((temp = bufferedReader.readLine())!=null){
            System.out.println(temp);
        }

        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException{
        ReadWholeFile("output2.txt");
    }


}
