package org.example.Quizz5.Builder;

public class CoffeeDirector {


    public void constructCoffee(CoffeeBuilder builder){
        builder.buildType();
        builder.buildSize();
        builder.buildToppings();
    }

}
