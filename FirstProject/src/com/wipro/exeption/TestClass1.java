package com.wipro.exeption;

public class TestClass1 {

	public static void main(String[] args) {
		int x = 100,y=0;
		try {
		int z = x/y;
		System.out.println("divsion is: " + z);
		}catch(ArithmeticException e) {
			System.out.println("Denomenator should not be 0");
		}
		
	}


	}


