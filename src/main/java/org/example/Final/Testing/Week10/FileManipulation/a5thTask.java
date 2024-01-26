package org.example.Final.Testing.Week10.FileManipulation;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

class a5thTask {

    public static void ReadWholeFileWithStreams(String fileName) throws IOException{

        BufferedReader bufferedReader=new BufferedReader(
                new FileReader(fileName)
        );

        List<String> lines=bufferedReader.lines().collect(Collectors.toList());

        for (String line:lines){
            System.out.println(line);
        }

        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException{
        ReadWholeFileWithStreams("output2.txt");
    }


}
