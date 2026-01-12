package com.library;

public class CreditCardProcessor implements PaymentProcessor {

    private String cardNumber;

    public CreditCardProcessor(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Validating Card " + cardNumber + "...");
        System.out.println("Paid $" + amount + " using Credit Card.");
    }


}
