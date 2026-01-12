package com.library.model;

public class CreditCardProcessor implements PaymentProcessor {

    private String cardNumber;
    private double balance;

    public CreditCardProcessor(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public boolean processPayment(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean isValidated() {

        if (cardNumber != null && cardNumber.length() == 16) {
            return true;
        }

        return false;
    }


}
