package com.wipro.exeption;

import java.util.Scanner;
import java.util.InputMismatchException;
public class TestClass3 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println(" Enter first number"  );
			int num1 =scanner.nextInt();
			
			System.out.println(" Enter Second number"  );
			int num2 =scanner.nextInt();
			
			int z= num1/num2;
			System.out.println(" Division is" +z );
			
		}catch(RuntimeException e) {
			
			if(e instanceof ArithmeticException) {
				System.out.println(" don't enter zero as denominator"  );
			}
			
			else if(e instanceof InputMismatchException) {
				System.out.println("Only numberic value");
			}
			System.out.println("remaning  statements exceuted");
			
		}

	}

}
