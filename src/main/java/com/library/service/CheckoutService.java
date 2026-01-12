package com.library.service;

import com.library.exception.InsufficientFundsException;
import com.library.model.PaymentProcessor;

public class CheckoutService {
    private PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {
        if (!paymentProcessor.isValidated()) {
            System.out.println("Error: Invalid payment details.");
            return;
        }

        try {
            paymentProcessor.processPayment(amount);
            System.out.println("Checkout complete! Receipt sent.\n");
        } catch (InsufficientFundsException e) {
            System.out.println("TRANSACTION FAILED: " + e.getMessage());
            System.out.println("Please add more funds and try again.\n");
        }

    }
}
