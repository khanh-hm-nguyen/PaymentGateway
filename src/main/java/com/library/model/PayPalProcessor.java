package com.library.model;

public class PayPalProcessor extends BasePaymentProcessor {

    private String emailAddress;

    public PayPalProcessor(String emailAddress, double balance) {
        super(balance);
        this.emailAddress = emailAddress;
    }


    @Override
    public boolean isValidated() {
        if (emailAddress != null && emailAddress.contains("@")) {
            return true;
        }
        return false;
    }

}
