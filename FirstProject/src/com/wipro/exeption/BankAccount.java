package com.wipro.exeption;

/*Design and implement a custom exception class called InsufficientFundsException that extends Exception. This exception should include:
A constructor that accepts a String message parameter to describe the error.
Ensure it properly inherits constructors and methods from its superclass.
Implement a method withdraw in a BankAccount class that performs a withdrawal operation. It should:
Accept an amount parameter indicating the amount to withdraw.
Throw an InsufficientFundsException if the withdrawal amount exceeds the balance of the account.
Deduct the withdrawal amount from the balance if the operation is successful.
Demonstrate the usage of your custom exception and withdraw method in a Main class:
Create an instance of BankAccount.
Perform withdrawals that might trigger the InsufficientFundsException.
Catch and handle the exception appropriately, displaying an error message.*/


public class BankAccount {
 private String accountNumber;
 private double balance;

 public BankAccount(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 public double getBalance() {
     return balance;
 }

 public void withdraw(double amount) throws InsufficientFundsException {
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds in account " + accountNumber);
     } else {
         balance -= amount;
         System.out.println("Successfully withdrew $" + amount + " from account " + accountNumber + " now the  Current balance is " + getBalance());
         
     }
 }
}
