package com.app;
import java.util.Scanner;

public class PaymentGateway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 1500.50;

        System.out.println("===== Payment Options =====");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");
        System.out.println("4. Net Banking");
        System.out.println("5. Cash on Delivery");
        System.out.print("Select a payment method (1-5): ");
        int paymentChoice = scanner.nextInt();

        switch (paymentChoice) {
            case 1:
                System.out.println("You selected Credit Card.");
                System.out.print("Enter card number: ");
                String ccNumber = scanner.next();
                System.out.print("Enter CVV: ");
                String cvv = scanner.next();
                
                System.out.println("Processing ₹" + amount + " via Credit Card...");
                System.out.println("Payment Successful!");
                break;

            case 2:
                System.out.println("You selected Debit Card.");
                System.out.print("Enter card number: ");
                String dcNumber = scanner.next();
                System.out.print("Enter PIN: ");
                String pin = scanner.next();
                System.out.println("Processing ₹" + amount + " via Debit Card...");
                System.out.println("Payment Successful!");
                break;

            case 3:
                System.out.println("You selected UPI.");
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.next();
                System.out.println("Sending payment request to " + upiId + "...");
                System.out.println("Payment Successful!");
                break;

            case 4:
                System.out.println("You selected Net Banking.");
                System.out.print("Select Bank (HDFC/SBI/ICICI): ");
                String bank = scanner.next();
                System.out.println("Redirecting to " + bank + " Net Banking portal...");
                System.out.println("Processing ₹" + amount + "...");
                System.out.println("Payment Successful!");
                break;

            case 5:
                System.out.println("You selected Cash on Delivery.");
                System.out.println("Order placed. Please pay ₹" + amount + " at delivery.");
                break;

            default:
                System.out.println("Invalid payment option. Please try again.");
        }

        scanner.close();
    }
}

