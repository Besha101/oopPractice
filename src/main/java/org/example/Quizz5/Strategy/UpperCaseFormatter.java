package org.example.Quizz5.Strategy;

public class UpperCaseFormatter implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
