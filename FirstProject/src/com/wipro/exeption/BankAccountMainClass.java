package com.wipro.exeption;

public class BankAccountMainClass {
	public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 400.0);

        try {
            account.withdraw(300.0); // Should succeed
           // account.withdraw(300.0); // Should throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
            
        }
    }
}
