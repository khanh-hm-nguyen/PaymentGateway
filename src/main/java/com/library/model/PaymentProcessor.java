package com.library.model;

public interface PaymentProcessor {

    void processPayment(double amount);
    boolean isValidated();
}