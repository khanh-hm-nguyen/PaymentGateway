package com.library;

import com.library.model.CreditCardProcessor;
import com.library.model.PayPalProcessor;
import com.library.model.PaymentProcessor;
import com.library.service.CheckoutService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor processor = null;

        System.out.println("=== PAYMENT GATEWAY SIMULATOR ===");

        // 1. Choose Payment Method
        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
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

        CheckoutService service = new CheckoutService(processor);

        while (true) {
            System.out.print("\nEnter amount to pay (or 0 to exit): ");
            double amount = scanner.nextDouble();

            if (amount == 0) break;

            service.checkout(amount);
        }

        System.out.println("System shutting down.");
        scanner.close();
    }
}
