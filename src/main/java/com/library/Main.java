package com.library;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // credit card
        PaymentProcessor card = new CreditCardProcessor("343e");
        CheckoutService checkout1 = new CheckoutService(card);
        checkout1.checkout(100);

        // paypal
        PaymentProcessor paypal = new PayPalProcessor("abc@mail.com");
        CheckoutService checkout2 = new CheckoutService(paypal);
        checkout2.checkout(84.23);
    }
}
