package com.library.model;

public class CreditCardProcessor extends BasePaymentProcessor {

    private String cardNumber;

    public CreditCardProcessor(String cardNumber, double balance) {
        super(balance);
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean isValidated() {
        return cardNumber != null && cardNumber.length() == 16;
    }


}
