package org.example.Final.Testing.Week10.FileManipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class a1stTask {

    public static void SimpleWrite(String text) throws IOException {

        BufferedWriter bufferedWriter=new BufferedWriter(
                new FileWriter("output1.txt")
        );
        bufferedWriter.write(text);
        bufferedWriter.close();


    }

    public static void main(String[] args) throws IOException {
        SimpleWrite("string");
    }


}
