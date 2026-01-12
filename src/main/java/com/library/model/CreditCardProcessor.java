package com.library.model;

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

    @Override
    public boolean isValidated() {

        if (cardNumber != null && cardNumber.length() == 16) {
            return true;
        }

        return false;
    }


}
