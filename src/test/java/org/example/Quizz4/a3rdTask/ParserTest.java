package org.example.Quizz4.a3rdTask;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    public void test() throws MySystemException {

        int count=0;
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("data3.txt"))){
            while(bufferedReader.readLine()!=null){
                count++;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }


        assertEquals(16,count);


    }
}