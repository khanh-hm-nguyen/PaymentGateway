package com.library.model;

import com.library.exception.InsufficientFundsException;

public interface PaymentProcessor {

    void processPayment(double amount) throws InsufficientFundsException;
    boolean isValidated();
}