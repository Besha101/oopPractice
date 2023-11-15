package a4thTask;

public class Bird<type> extends Animal{

    private type birdType;

    public Bird(int kg,int age,type birdType){
        super(kg,age);
        this.birdType=birdType;
    }

    public type getBirdType(){
        return birdType;
    }

    public void setBirdType(type birdType){
        this.birdType=birdType;
    }
    @Override
    public String saySomething(){
        return "piu piu";
    }

}
