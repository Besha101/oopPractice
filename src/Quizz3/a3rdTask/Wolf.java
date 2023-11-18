package Quizz3.a3rdTask;

public class Wolf implements AnimalInterface{

    private String name;

    public Wolf(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){

        this.name=name;

    }

    public String saySomething(){
        return "Wuuuuuuoooooo";
    }

}
