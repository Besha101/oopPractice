package Midterm.everythingTask1;
import java.util.HashMap;
import java.util.Optional;

public class HashMapGradingSystem implements GradingSystem{

    private HashMap<String,Double> grades;

    public HashMapGradingSystem(){
        this.grades=new HashMap<>();
    }
    public void addGrade(String studentId, double grade){

        grades.put(studentId,grade);



    }

    public Optional<Double> getGrade(String StudentId){

        return Optional.ofNullable(grades.get(StudentId));

    }

    @Override
    public double calculateAverageGrade() {
        double sum=0.0;
        double avg;
        int count=0;

        if(grades.isEmpty()){
            return 0.0;
        }

        for(Double grade:grades.values()){

            sum+=grade;
            count++;

        }
        avg=sum/count;

        return avg;
    }
}
