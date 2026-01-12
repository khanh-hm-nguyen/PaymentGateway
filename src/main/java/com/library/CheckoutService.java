package com.library;

public class CheckoutService {
    private PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {
        System.out.println("Initiating checkout...");
        paymentProcessor.processPayment(amount);
        System.out.println("Checkout complete!\n");
    }
}
