package com.wipro.exeption;

import java.util.InputMismatchException;
import java.util.Scanner;
//:Write a Java method divideNumbers(int a, int b) that takes two integers as parameters and
//computes their division. Handle the ArithmeticException (for division by zero) and
//NumberFormatException (for invalid input) exceptions gracefully.
public class TestClass5 {

	public void divideNumbers(int a, int b) {

		int div = a / b;
		System.out.println(div); 
}

public static void main(String[] args) {
	TestClass5 t = new TestClass5();
	String a,b;
	try{
		Scanner sc = new Scanner(System.in);
		 a = sc.nextLine();
		 b = sc.nextLine();
		 int x = Integer.parseInt(a);
		 int y = Integer.parseInt(b);
		 t.divideNumbers(x, y);
	}
	catch(Exception e) {
		if(e instanceof InputMismatchException) {
			System.out.println("Invalid Input");
		}
		else if(e instanceof ArithmeticException) {
			System.out.println("Division with zero cannot be possible");
		}
		else if(e instanceof NumberFormatException) {
			System.out.println("Invalid Input Number Format");
		}
		
	}
	finally {
		System.out.println("Finally block excecuted");
	}
}

}

