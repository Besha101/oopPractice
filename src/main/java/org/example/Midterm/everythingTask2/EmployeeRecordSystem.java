package org.example.Midterm.everythingTask2;

import java.util.HashMap;
import java.util.Optional;

public class EmployeeRecordSystem {
    private HashMap<String, EmployeeRecord> employeeRecords;

    public EmployeeRecordSystem(){
        this.employeeRecords=new HashMap<>();
    }
    public void addEmployeeRecord(EmployeeRecord employeeRecord){

        employeeRecords.put(employeeRecord.employeeId(),employeeRecord);

    }

    public Optional<EmployeeRecord> getEmployeeRecord(String employeeId){
        return Optional.ofNullable(employeeRecords.get(employeeId));

    }

    public void updateSalary(String employeeId,double newSalary){
        EmployeeRecord employeeRecord=employeeRecords.get(employeeId);

        EmployeeRecord updateRecord=new EmployeeRecord(employeeRecord.employeeId(),employeeRecord.name(),employeeRecord.name(),newSalary);

        employeeRecords.put(employeeId,updateRecord);
    }

    public double calculateAverageSalary(){
        double sum=0;
        double avg;
        int counter=0;

        for(EmployeeRecord employee:employeeRecords.values()){
            sum+=employee.salary();
            counter++;
        }
        avg=sum/counter;

        return avg;
    }

}
