package com.library.service;

import com.library.model.PaymentProcessor;

public class CheckoutService {
    private PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {

        if (paymentProcessor.isValidated()) {
            System.out.println("Initiating checkout...");
            paymentProcessor.processPayment(amount);
            System.out.println("Checkout complete!\n");
        } else {
            System.out.println("Error: Invalid payment details. Transaction cancelled.\n");
        }

    }
}
