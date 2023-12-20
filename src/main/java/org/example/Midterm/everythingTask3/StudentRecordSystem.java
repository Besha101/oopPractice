package org.example.Midterm.everythingTask3;

import java.util.HashMap;
import java.util.Optional;

public class StudentRecordSystem {

    HashMap<String,StudentRecord> studentRecords;

    public StudentRecordSystem(){
        this.studentRecords=new HashMap<>();
    }
    public void addStudentRecord(StudentRecord studentRecord){

        studentRecords.put(studentRecord.studentId(),studentRecord);

    }

    public Optional<StudentRecord> getStudentRecord(String studentId){

        for(StudentRecord student:studentRecords.values()){
        if(student.studentId()==studentId){
            return Optional.of(studentRecords.get(studentId));
        }

        }
        return Optional.empty();
    }

    public void updateGPA(String studentId, double newGPA){

        StudentRecord studentRecord=studentRecords.get(studentId);

        if(studentRecord!=null){
            StudentRecord updatedRecord=new StudentRecord(
                    studentRecord.studentId(),
                    studentRecord.name(),
                    studentRecord.major(),
                    newGPA
            );

            studentRecords.put(studentId,updatedRecord);
        }




    }

    public double avgGpa(){
        double sum=0.0;
        double avg;
        int counter=0;

        for(StudentRecord student:studentRecords.values()){
            sum+=student.gpa();
            counter++;
        }
        avg=sum/counter;
        return avg;
    }


}



