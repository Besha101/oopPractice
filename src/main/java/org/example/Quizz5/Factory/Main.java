package org.example.Quizz5.Factory;

public class Main {

    public static void main(String[] args) {
        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        Payment creditCardPayment = creditCardFactory.createPayment();
        creditCardPayment.processPayment();

        PaymentFactory paypalFactory = new PayPalPaymentFactory();
        Payment paypalPayment = paypalFactory.createPayment();
        paypalPayment.processPayment();
    }

}
