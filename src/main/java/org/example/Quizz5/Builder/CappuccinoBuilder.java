package org.example.Quizz5.Builder;

public class CappuccinoBuilder implements CoffeeBuilder{

    private Coffee coffee;

    public CappuccinoBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public void buildType(){
        coffee.setType("Cappucino");
    }
    @Override
    public void buildSize(){
        coffee.setSize("Big");
    }

    @Override
    public  void buildToppings(){

    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }


}
