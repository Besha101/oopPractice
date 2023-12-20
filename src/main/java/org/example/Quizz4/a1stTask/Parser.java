package org.example.Quizz4.a1stTask;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Parser {

    public static void saveConfigurableFields(String fileName, Object object) throws MySystemException{

        try(FileWriter fileWriter=new FileWriter(fileName,true)){
            Class<?> clazz=object.getClass();
            Field[] fields=clazz.getDeclaredFields();

            for(Field field:fields){
                if(field.isAnnotationPresent(ConfigurableField.class)){
                    field.setAccessible(true);
                    String fieldName=field.getName();
                    Object fieldValue=field.get(object);

                    fileWriter.write(fieldName+":"+fieldValue);
                }
            }
        }
        catch(IOException | IllegalAccessException e){
            throw new MySystemException("Error my exception");
        }
    }
}
