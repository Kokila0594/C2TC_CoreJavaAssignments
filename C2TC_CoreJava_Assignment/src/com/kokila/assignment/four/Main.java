package com.kokila.assignment.four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for booking details
        System.out.println("Enter ticket booking details in CSV format (stageEvent,customer,noOfSeats):");
        String bookingDetails = sc.nextLine();
        String[] parts = bookingDetails.split(",");
        String stageEvent = parts[0];
        String customer = parts[1];
        Integer noOfSeats = Integer.parseInt(parts[2]);

        // Create TicketBooking object
        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        // Ask payment mode
        System.out.println("\nChoose Payment Mode:");
        System.out.println("1. Cash payment");
        System.out.println("2. Wallet payment");
        System.out.println("3. Credit card payment");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1: // Cash payment
                System.out.println("Enter amount:");
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;

            case 2: // Wallet payment
                System.out.println("Enter amount:");
                double walletAmount = sc.nextDouble();
                sc.nextLine(); // consume newline
                System.out.println("Enter wallet number:");
                String walletNumber = sc.nextLine();
                booking.makePayment(walletAmount, walletNumber);
                break;

            case 3: // Credit card payment (simplified)
                System.out.println("Enter cardholder name:");
                String holderName = sc.nextLine();
                System.out.println("Enter amount:");
                double cardAmount = sc.nextDouble();
                booking.makePayment(holderName, cardAmount);
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        // Print final receipt
        booking.printReceipt();

        sc.close();
    }
}