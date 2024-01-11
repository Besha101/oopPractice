package org.example.Quizz5.Factory;

public class CreditCardPaymentFactory implements PaymentFactory {

    public Payment createPayment(){
        return new CreditCardPayment();
    }


}
