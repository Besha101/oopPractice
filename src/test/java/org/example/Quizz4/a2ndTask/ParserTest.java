package org.example.Quizz4.a2ndTask;

import org.example.Quizz4.a1stTask.MySystemException;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    public void test() throws MySystemException {

        assertEquals(4,countLines());

    }

    private int countLines(){
        int count=0;

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("data1.txt"))){
            while(bufferedReader.readLine()!=null){
                count++;
            }
        }

        catch (IOException e){
            e.printStackTrace();
        }

        return count;
    }

}