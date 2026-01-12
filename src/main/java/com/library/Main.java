package com.library;

import com.library.model.CreditCardProcessor;
import com.library.model.PayPalProcessor;
import com.library.model.PaymentProcessor;
import com.library.service.CheckoutService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        PaymentProcessor processor = null;

        boolean isCheckout = true;

        System.out.println("=== PAYMENT GATEWAY SIMULATOR ===");

        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Checkout");
        System.out.println("4. Exit");
        System.out.print("Select (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter Card Number (16 digits): ");
            String cardNum = scanner.nextLine();
            System.out.print("Enter Initial Balance: ");
            double balance = scanner.nextDouble();
            processor = new CreditCardProcessor(cardNum, balance);
        } else if (choice == 2) {
            System.out.print("Enter PayPal Email: ");
            String email = scanner.nextLine();
            System.out.print("Enter Initial Balance: ");
            double bal = scanner.nextDouble();
            processor = new PayPalProcessor(email, bal);
        } else {
            System.out.println("Invalid choice. Exiting");
        }


        while (isCheckout) {
            checkoutPayment(processor);
            isCheckout = false;
        }

        scanner.close();
    }

    static void checkoutPayment(PaymentProcessor processor) {
        CheckoutService service = new CheckoutService(processor);

        System.out.print("Please enter the amount to checkout: ");
        double amount = scanner.nextDouble();

        service.checkout(amount);

    }
}
