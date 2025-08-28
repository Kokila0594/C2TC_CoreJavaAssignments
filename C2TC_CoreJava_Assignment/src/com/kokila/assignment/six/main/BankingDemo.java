package com.kokila.assignment.six.main;

import AssignmentSix.Model.BankAccount;
import AssignmentSix.Exceptions.*;

public class BankingDemo {
	public static void main(String[] args) {
        // Create BankAccount object
        BankAccount account = new BankAccount(1001, 5000);

        account.displayBalance();

        try {
            account.deposit(2000);
            account.withdraw(1000);
            account.withdraw(7000);  // This will throw InsufficientFundsException
        }
        catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction complete. Final balance: ");
            account.displayBalance();
        }
    }
}
