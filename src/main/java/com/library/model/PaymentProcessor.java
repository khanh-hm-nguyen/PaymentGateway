package com.library.model;

public interface PaymentProcessor {

    boolean processPayment(double amount);
    boolean isValidated();
}