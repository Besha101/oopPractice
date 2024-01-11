package org.example.Quizz5.Factory;

public class PayPalPayment implements Payment{

    public void processPayment(){
        System.out.println("Paid with paypal");
    }

}
