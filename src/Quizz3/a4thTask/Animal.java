package Quizz3.a4thTask;

public abstract class Animal {

    private int kg;
    private int age;

    public Animal(int kg, int age){
        this.kg=kg;
        this.age=age;
    }

    public int getKg(){
        return kg;
    }

    public void setKg(int kg){
        this.kg=kg;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String saySomething(){
        return "Animal";
    }


}
