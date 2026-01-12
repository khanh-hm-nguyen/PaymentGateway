package com.library;

public class PayPalProcessor implements PaymentProcessor {

    private String emailAddress;

    public PayPalProcessor(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Connecting to PayPal account: " + emailAddress + "...");
        System.out.println("Paid $" + amount + " via PayPal.");
    }
}
