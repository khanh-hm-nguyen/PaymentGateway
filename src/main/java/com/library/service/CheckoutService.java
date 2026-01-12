package com.library.service;

import com.library.model.PaymentProcessor;

public class CheckoutService {
    private PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {

        if (!paymentProcessor.isValidated()) {
            System.out.println("Error: Invalid payment details (Card/Email invalid).");
            return;
        }

        boolean success = paymentProcessor.processPayment(amount);

        if (success) {
            System.out.println("Payment successful! Order confirmed.");
        } else {
            System.out.println("Error: Insufficient funds. Transaction declined.");
        }

    }
}
