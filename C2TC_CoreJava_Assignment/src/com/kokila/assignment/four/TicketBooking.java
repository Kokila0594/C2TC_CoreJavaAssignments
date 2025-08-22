package com.kokila.assignment.four;


public class TicketBooking {
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // For receipt details
    private String paymentMethod;
    private double amountPaid;
    private String extraDetails = "";

    // Default constructor
    public TicketBooking() {
    }

    // Parameterized constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Overloaded methods for payments

    // 1. Cash payment
    public void makePayment(double amount) {
        this.amountPaid = amount;
        this.paymentMethod = "Cash";
    }

    // 2. Wallet payment
    public void makePayment(double amount, String walletNumber) {
        this.amountPaid = amount;
        this.paymentMethod = "Wallet";
        this.extraDetails = "Wallet number: " + walletNumber;
    }

    // 3. Credit card payment (simplified: only holder name + amount)
    public void makePayment(String holderName, double amount) {
        this.amountPaid = amount;
        this.paymentMethod = "Credit Card";
        this.extraDetails = "Holder name: " + holderName;
    }

    // Final receipt
    public void printReceipt() {
        System.out.println("\n------ RECEIPT ------");
        System.out.println("Stage event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of seats: " + noOfSeats);
        System.out.printf("Amount Paid: %.1f%n", amountPaid);
        System.out.println("Payment Method: " + paymentMethod);
        if (!extraDetails.isEmpty()) {
            System.out.println(extraDetails);
        }
        System.out.println("---------------------");
    }
}