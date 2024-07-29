package com.wipro.exeption;

import java.util.Scanner;
import java.util.InputMismatchException;
public class TestClass2 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" Enter first number"  );
			int num1 = scanner.nextInt();
			System.out.println(" Enter second number"  );
			int num2 = scanner.nextInt();
			int z= num1/num2;
			System.out.println("divsion is: " + z);
		}catch(ArithmeticException e) {
			System.out.println("don't enter zero as denominator");
		}catch(InputMismatchException ee) {
			System.out.println("Only numberic value");
		}
		System.out.println("remaning  statements exceuted");
	}

}
