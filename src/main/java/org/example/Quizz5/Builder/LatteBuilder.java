package org.example.Quizz5.Builder;

public class LatteBuilder implements CoffeeBuilder {

    private Coffee coffee;


    public LatteBuilder() {
        this.coffee = new Coffee();
    }


    @Override
    public void buildType(){
        coffee.setType("Latte");
    }
    @Override
    public void buildSize(){
        coffee.setSize("Medium");
    }

    @Override
    public  void buildToppings(){

    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
