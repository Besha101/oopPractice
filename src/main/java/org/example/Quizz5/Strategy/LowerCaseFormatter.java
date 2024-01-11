package org.example.Quizz5.Strategy;

public class LowerCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
