package org.example.Final.Testing.Week10.aLabPractice.a3rdTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Events {

    private static final int numRecords=1000;




    public static void generateEventsFile(String fileName, int numOfRecords) throws IOException {
        Random rand=new Random();

        String[] list={"Login", "Logout", "Purchase", "ViewPage", "Error"};





        BufferedWriter bufferedWriter=new BufferedWriter(
                new FileWriter(fileName)
        );
        for(int i=0;i<numOfRecords;i++){
            int hours=rand.nextInt(24);
            int minutes=rand.nextInt(60);
            int num=rand.nextInt(5);
            int id=rand.nextInt(1000);

            bufferedWriter.write("Timestamp: "+hours+":"+minutes+"   , Event Type: "+list[num]+"   , User ID: "+id);
            bufferedWriter.newLine();
        }

        System.out.println("Events log file generation complete.");
        bufferedWriter.close();


    }

    public static void readEventsFile(String fileName) throws IOException {
        String line;
        int iteration=0;
        BufferedReader bufferedReader=new BufferedReader(
                new FileReader(fileName)
        );

        while((line= bufferedReader.readLine())!=null && iteration<5){
            System.out.println(line);

            if (!bufferedReader.ready()){
                iteration++;
            }

        }

        System.out.println("Events log file reading complete.");
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        String fileName="outputLab3.txt";
        generateEventsFile(fileName,numRecords);
        readEventsFile(fileName);
    }


}
