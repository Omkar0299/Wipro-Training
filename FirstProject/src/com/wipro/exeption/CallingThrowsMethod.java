package com.wipro.exeption;

public class CallingThrowsMethod {

	public static void main(String[] args) {
		ThrowsExampleClass obj = new ThrowsExampleClass();
		try {
			obj.div();
			}catch(ArithmeticException e) {
				System.out.println("Denominator should not be 0");
			}	
	}

}
