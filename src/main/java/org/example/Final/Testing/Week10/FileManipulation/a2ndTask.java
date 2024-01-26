package org.example.Final.Testing.Week10.FileManipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class a2ndTask {

    public static void ArrayFileWriter(String[] data) throws IOException {

        BufferedWriter bufferedWriter=new BufferedWriter(
                new FileWriter("output2.txt")
        );

        for (String word:data){
            bufferedWriter.write(word+"\n");
        }
        bufferedWriter.close();



    }

    public static void main(String[] args) throws IOException{
        String[] names = {"Becir", "Adnan", "Amila"};

        ArrayFileWriter(names);
    }


}
