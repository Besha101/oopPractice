package org.example.Quizz3.a1stTask;

public class Cat implements Animal{

    private int age;

    public Cat(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }


    @Override
    public String animalSound(){
        return "MEOW";
    }

}
