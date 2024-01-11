package org.example.Quizz5.Builder;

import java.util.List;

public class Coffee {

    private String size;
    private List<String> toppings;
    private String type;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(String topping) {
        toppings.add(topping);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "size='" + size + '\'' +
                ", toppings=" + toppings +
                ", type='" + type + '\'' +
                '}';
    }
}
