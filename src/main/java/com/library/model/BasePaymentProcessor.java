package com.library.model;
import com.library.exception.InsufficientFundsException;

public abstract class BasePaymentProcessor implements PaymentProcessor {

    protected double balance;

    public BasePaymentProcessor(double balance) {
        this.balance = balance;
    }

    @Override
    public void processPayment(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw  new InsufficientFundsException("Not enough money. Needed: " + amount);
        }

        balance -= amount;
        System.out.println("Payment approved. New balance: " + balance);
    }

    @Override
    public boolean isValidated() {
        return false;
    }
}
