package com.kokila.assignment.six.model;

import com.kokila.assignment.six.*;
import com.kokila.assignment.six.*;

public class BankAccount {
	private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive!");
        }
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Available: " + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: " + amount);
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
    }
}