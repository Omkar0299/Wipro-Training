package com.wipro.exeption;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
        super(message); // Call the superclass constructor with the message
    }

}
