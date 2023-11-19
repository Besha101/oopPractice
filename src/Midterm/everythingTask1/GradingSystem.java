package Midterm.everythingTask1;

import java.util.Optional;

public interface GradingSystem {

    void addGrade(String studentId, double grade);
    Optional<Double> getGrade(String studentId);
    double calculateAverageGrade();



}
