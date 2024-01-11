package org.example.Quizz5.Strategy;

public class main {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();


        textEditor.setFormatter(new UpperCaseFormatter());
        String upperCaseText = textEditor.formatText("Hello, Strategy Pattern!");
        System.out.println("Upper Case: " + upperCaseText);

        textEditor.setFormatter(new LowerCaseFormatter());
        String lowerCaseText = textEditor.formatText("Hello, Strategy Pattern!");
        System.out.println("Lower Case: " + lowerCaseText);

        textEditor.setFormatter(new CamelCaseFormatter());
        String camelCaseText = textEditor.formatText("Hello, Strategy Pattern!");
        System.out.println("Camel Case: " + camelCaseText);
    }

}
