package org.example.Quizz4;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    public void testMainMethod() throws MySystemException {



        assertEquals(4,countLines());







    }



    private int countLines(){

        int lineCount=0;

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("data.txt"))){
            while(bufferedReader.readLine()!=null){
                lineCount++;
            }
        }

        catch(IOException e){
            e.printStackTrace();
        }

        return lineCount;

    }

}