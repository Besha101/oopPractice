package org.example.Quizz3.a1stTask;

public class Dog implements Animal{

    private String name;
    private int age;

    public Dog(String name){
        this.name=name;
    }

    public Dog(int age){
        this.age=age;
    }

    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }




    @Override
    public String animalSound(){
        return "Woof woof";
    }

}
