package com.library.model;

public class PayPalProcessor implements PaymentProcessor {

    private String emailAddress;
    private double balance;

    public PayPalProcessor(String emailAddress, double balance) {
        this.emailAddress = emailAddress;
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
        if (emailAddress != null && emailAddress.contains("@")) {
            return true;
        }
        return false;
    }

}
