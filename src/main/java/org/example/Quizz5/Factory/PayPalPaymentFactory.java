package org.example.Quizz5.Factory;

public class PayPalPaymentFactory implements PaymentFactory{

    public Payment createPayment(){
        return new PayPalPayment();
    }

}
